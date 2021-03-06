package com.linkedin;

public class PaintHouse {

	public int minCost(int[][] costs) {
		if (costs == null || costs.length == 0 || costs[0] == null) {
			return 0;
		}

		for (int i = 1; i < costs.length; i++) {
			costs[i][0] = Math.min(costs[i][0] + costs[i - 1][1], costs[i][0] + costs[i - 1][2]);
			costs[i][1] = Math.min(costs[i][1] + costs[i - 1][0], costs[i][1] + costs[i - 1][2]);
			costs[i][2] = Math.min(costs[i][2] + costs[i - 1][0], costs[i][2] + costs[i - 1][1]);
		}
		
		int len = costs.length - 1;
		return Math.min(costs[len][0], Math.min(costs[len][1], costs[len][2]));
	}
}
