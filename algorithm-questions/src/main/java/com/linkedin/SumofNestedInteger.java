package com.linkedin;

import java.util.List;

public class SumofNestedInteger {
	public int depthSum(List<NestedInteger> input) {
		return depthSum(input, 1);
	}

	public int depthSum(List<NestedInteger> input, int depth) {
		int sum = 0;
		for (NestedInteger nestedInt : input) {
			if (nestedInt.isInteger()) {
				sum += nestedInt.getInteger() * depth;
			} else {
				sum += depthSum(nestedInt.getNestedIntegers(), depth + 1);
			}
		}

		return sum;
	}
}
