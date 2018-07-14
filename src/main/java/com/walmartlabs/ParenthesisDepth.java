package com.walmartlabs;

/**
 * Created by bangchuanliu on 5/29/16.
 */
public class ParenthesisDepth {

	public int maxDepth(String str) {
		int depth = 0;
		int leftCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				leftCount++;
				depth = Math.max(leftCount, depth);
			} else if (str.charAt(i) == ')') {
				leftCount--;
				if (leftCount < 0) {
					return 0;
				}
			}
		}

		return depth;
	}
}
