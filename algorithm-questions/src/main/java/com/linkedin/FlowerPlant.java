package com.linkedin;

public class FlowerPlant {
	
	public boolean flowerPlant(int[] plots, int num) {
		if (plots == null || plots.length == 0 || num <= 0) {
			return false;
		}
		
		for (int i = 0; i < plots.length; i++) {
			if (plots[i] == 0) {
				if (i > 0 && plots[i - 1] == 1 || i < plots.length - 1 && plots[i + 1] == 1) {
					continue;
				}
				plots[i] = 1;
				num--;
			}
		}
		
		return num <= 0;
	}
}
