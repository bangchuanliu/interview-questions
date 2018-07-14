package com.linkedin;

import java.util.HashSet;
import java.util.Set;

import org.tree.TreeNode;

public class PrintLeafNode {
	
	public void printLeaf(TreeNode root) {
		if (root == null) {
			return;
		}
		
		Set<TreeNode> set = new HashSet<>();
		while (!set.contains(root)) {
			printLeaf(root, set);
			System.out.println();
		}
	}
	
	public void printLeaf(TreeNode root, Set<TreeNode> set) {
		if (root == null || set.contains(root)) {
			return;
		}
		
		if (root.left == null && root.right == null) {
			set.add(root);
			System.out.print(root.val + " ");			
		} else if (root.left != null && set.contains(root.left)) {
			set.add(root);
			System.out.print(root.val + " ");	
		} else if (root.right != null && set.contains(root.right)) {
			set.add(root);
			System.out.print(root.val + " ");	
		} else if (set.contains(root.left) && set.contains(root.right)) {
			set.add(root);
			System.out.print(root.val + " ");	
		}
		
		printLeaf(root.left, set);
		printLeaf(root.right, set);
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		
		PrintLeafNode instance = new PrintLeafNode();
		instance.printLeaf(n1);
	}
}
