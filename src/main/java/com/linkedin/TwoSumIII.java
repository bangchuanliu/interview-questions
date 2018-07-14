package com.linkedin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//read heavy
public class TwoSumIII {

	private List<Integer> nums = new ArrayList<>();
	Set<Integer> numSet = new HashSet<>();

	// Add the number to an internal data structure.
	public void add(int number) {
		nums.add(number);
	}

	// Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
		numSet.clear();
		for (Integer num : nums) {
			if (numSet.contains(num)) {
				return true;
			} else {
				numSet.add(value - num);
			}
		}
		return false;
	}

}

// write heavy
class TwoSum {

	Set<Integer> sums = new HashSet<>();
	List<Integer> nums = new ArrayList<>();

	public void addNumber(int num) {
		for (Integer number : nums) {
			sums.add(number + num);
		}
		nums.add(num);
	}

	public boolean findSum(int num) {
		return sums.contains(num);
	}

}