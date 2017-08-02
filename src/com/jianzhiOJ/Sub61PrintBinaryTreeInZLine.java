package com.jianzhiOJ;

import java.util.ArrayList;
import java.util.Stack;

public class Sub61PrintBinaryTreeInZLine {
	static TreeNode pRoot = new TreeNode(1);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pRoot = BuildTree(pRoot);
		ArrayList<ArrayList<Integer>> a = Print(pRoot);
		System.out.println(a.toString());
	}
static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
	    
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return res;
        int current = 1;
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        st1.push(pRoot);
        while(!st1.isEmpty() || !st2.isEmpty()){
        	if(current==1){
        		TreeNode tmp = st1.pop();
        		buffer.add(tmp.val);
        		if(tmp.left!=null){
        			st2.add(tmp.left);
        		}
        		if(tmp.right!=null){
        			st2.add(tmp.right);
        		}
        		if(st1.isEmpty()){
        			res.add(buffer);
        			buffer = new ArrayList<Integer>();
        			current = 0;
        		}
        	}else{
        		TreeNode tmpp = st2.pop();
        		buffer.add(tmpp.val);
        		if(tmpp.right!=null){
        			st1.add(tmpp.right);
        		}
        		if(tmpp.left!=null){
        			st1.add(tmpp.left);
        		}
        		if(st2.isEmpty()){
        			res.add(buffer);
        			buffer = new ArrayList<Integer>();
        			current = 1;
        		}
        	}
        }
        return res;
    }
	
	private static TreeNode BuildTree(TreeNode pRoot){
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(6);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(8);
		TreeNode t8 = new TreeNode(9);
		TreeNode t9 = new TreeNode(10);
		TreeNode t10 = new TreeNode(11);
		TreeNode t11 = new TreeNode(12);
		TreeNode t12 = new TreeNode(13);
		TreeNode t13 = new TreeNode(14);
		TreeNode t14 = new TreeNode(15);
		pRoot.left = t1;
		pRoot.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		t3.left = t7;t3.right=t8;
		t4.left=t9;t4.right=t10;
		t5.left=t11;t5.right=t12;
		t6.left=t13;t6.right=t14;
		return pRoot;
	}

}
