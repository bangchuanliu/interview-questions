package com.amazon;

import org.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelNodeNumber {
	
	
	// BFS
	public int maxNumsOfNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int max = Integer.MIN_VALUE;
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.offer(root);
		
		while (!nodes.isEmpty()) {
			int size = nodes.size();
			max = Math.max(max, size);
			for (int i = 0; i < nodes.size(); i++) {
				TreeNode node = nodes.poll();
				if (node.left != null) {
					nodes.add(node.left);
				}
				
				if (node.right != null) {
					nodes.add(node.right);
				}
			}
		}
		
		return max;
	}
	
	
	//DFS
	public int maxNumOfNode(TreeNode root) {
		List<Integer> nums = new ArrayList<>();
		maxNumOfNode(root, 0, nums);
		int max = Integer.MIN_VALUE;
		
		for (Integer num : nums) {
			max = Math.max(max, num);
		}
		
		return max;
	}
	
	public void maxNumOfNode(TreeNode root, int index, List<Integer> nums) {
		if (root == null) {
			return;
		}
		
		int num = nums.get(index);
		nums.set(index, num + 1);
		maxNumOfNode(root.left, index + 1, nums);
		maxNumOfNode(root.right, index + 1, nums);
	}
}
