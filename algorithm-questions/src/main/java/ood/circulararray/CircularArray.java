package org.ood.circulararray;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {

	@Override
	public Iterator<T> iterator() {
		return new CircularArrayIterator<T>();
	}
	
	
	private class CircularArrayIterator<TY> implements Iterator<TY> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public TY next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
