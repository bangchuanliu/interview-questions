package com.linkedin;

public class FindTarget {
	public int findIndex(int[] nums, int target) {
		if (nums == null || nums.length == 0 || target < nums[0] || target >= nums[nums.length - 1]) {
			return 0;
		}

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (high + low) / 2;

			if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				return mid + 1;
			}
		}

		return low;
	}
}
