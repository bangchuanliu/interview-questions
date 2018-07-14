package com.linkedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomRemove<T> {
	private List<T> list = new ArrayList<>();
	private Map<T, Integer> valueIndexMap = new HashMap<>();;
	private Random ran;

	public void add(T val) {
		list.add(val);
		valueIndexMap.put(val, list.size() - 1);
	}

	public void remove(T val) {
		Integer index = valueIndexMap.get(val);
		if (index == null) {
			return;
		}

		T lastVal = list.get(list.size() - 1);
		list.set(index, lastVal);
		list.remove(list.size() - 1);
		valueIndexMap.remove(val);
		valueIndexMap.put(lastVal, index);
	}

	public T getRandomElement() {
		int index = ran.nextInt(list.size());
		return list.get(index);
	}
}
