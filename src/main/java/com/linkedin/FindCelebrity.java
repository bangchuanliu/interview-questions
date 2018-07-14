package com.linkedin;

public abstract class FindCelebrity {

	public int findCelebrity(int n) {
		if (n <= 0) {
			return -1;
		}

		int cele = -1;

		int left = 0;
		int right = n - 1;

		while (left < right) {
			if (knows(left, right)) {
				left++;
			} else {
				right--;
			}
		}
		cele = left;

		for (int i = 0; i < n; i++) {
			if (i != cele && (knows(cele, i) || !knows(i, cele))) {
				return -1;
			}
		}

		return cele;
	}

	abstract boolean knows(int a, int b);
}
