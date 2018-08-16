package com.linkedin;

import java.util.Random;

public class CardShuffle {

	private Random rnd = new Random();
	
	public void shuffle(int[] nums) {
		for (int i = nums.length; i > 1; i--) {
			int j = rnd.nextInt(i);
			int temp = nums[i - 1];
			nums[i - 1] = nums[j];
			nums[j] = temp;
		}
	}
}
