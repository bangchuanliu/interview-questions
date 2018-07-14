package com.amazon;

import java.util.Iterator;

public class MaybeGoodIterator implements Iterator<Item>{

	private Item item;
	
	private Iterator<Item> iterator;
	
	public MaybeGoodIterator(Iterator<Item> iterator) {
		
	}

	@Override
	public boolean hasNext() {
		if (item != null) {
			return true;
		} else {
			while(iterator.hasNext()) {
				Item next = iterator.next();
				if (next.isGood()) {
					item = next;
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public Item next() {
		if (item != null) {
			Item next = item;
			item = null;
			return next;
		} else {
			while(iterator.hasNext()) {
				Item next = iterator.next();
				if (next.isGood()) {
					return item;
				}
			}
		}
		
		return null;
	}
}

class Item {
	
	private boolean good;
	
	public boolean isGood() {
		return good;
	}
}
