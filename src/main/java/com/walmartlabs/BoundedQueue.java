package com.walmartlabs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by bangchuanliu on 5/29/16.
 */
public class BoundedQueue<E> {

	private int capacity = 100;

	private Queue<E> queue;

	private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
	private final ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
	private final ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

	public BoundedQueue(int capacity) {
		this.capacity = capacity;
		queue = new LinkedList<>();
	}

	public E get() {
		try {
			readLock.tryLock(1, TimeUnit.SECONDS);
			while (queue.isEmpty()) {
				try {
					wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			E e = queue.poll();
			notifyAll();
			return e;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}


	public void add(E e) {
		try {
			writeLock.tryLock(1, TimeUnit.SECONDS);
			while (queue.size() == capacity) {
				try {
					wait(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			queue.add(e);
			notifyAll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
