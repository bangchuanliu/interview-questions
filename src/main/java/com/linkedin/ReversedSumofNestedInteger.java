package com.linkedin;

import java.util.List;

public class ReversedSumofNestedInteger {
	
	public int depthSum (List<NestedInteger> input){
		int depth = getDepth(input);
	    return depthSum(input, depth);
	}
	
	public int depthSum (List<NestedInteger> input, int depth){
		int sum = 0;
	    for (NestedInteger nestedInt : input) {
	    	if (nestedInt.isInteger()) {
	    		sum += nestedInt.getInteger() * depth;
	    	} else {
	    		sum += depthSum (nestedInt.getNestedIntegers(), depth--);
	    	}
	    }
	    
	    return sum;
	}
	
	public int getDepth(List<NestedInteger> input) {
		int depth = 0;
		for (NestedInteger nestedInteger : input) {
			if (nestedInteger.isInteger()) {
				depth = Math.max(depth, 1);
			} else {
				depth = Math.max(depth, getDepth(nestedInteger.getNestedIntegers()) + 1);
			}
		}
		
		return depth;
	}
	
	public static void main(String[] args) {
		ReversedSumofNestedInteger instance = new ReversedSumofNestedInteger();
//		System.out.println(instance.depthSum(input));
	}

}



interface NestedInteger {
	
	public boolean isInteger();
	
	public int getInteger();
	
	public List<NestedInteger> getNestedIntegers();
}
