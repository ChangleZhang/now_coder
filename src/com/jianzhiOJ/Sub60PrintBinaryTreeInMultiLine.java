package com.jianzhiOJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Sub60PrintBinaryTreeInMultiLine {

	static TreeNode pRoot = new TreeNode(8);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pRoot = BuildTree(pRoot);
		ArrayList<ArrayList<Integer>> a = Print(pRoot);
		System.out.println(a.toString());
	}

	static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	    
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return res;
        int nextLevel = 0;
        int toBePrint = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            buffer.add(tmp.val);
            if(tmp.left!=null){
                queue.offer(tmp.left);
                nextLevel++;
            }
            if(tmp.right!=null){
				queue.offer(tmp.right);
                nextLevel++;
            }
            toBePrint--;
            if(toBePrint==0){
                res.add(buffer);
                buffer = new ArrayList<Integer>();
                toBePrint = nextLevel;
                nextLevel=0;
            }
        }
        return res;
    }
	
	private static TreeNode BuildTree(TreeNode pRoot){
		TreeNode t1 = new TreeNode(6);
		TreeNode t2 = new TreeNode(10);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(9);
		TreeNode t6 = new TreeNode(11);
		pRoot.left = t1;
		pRoot.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		return pRoot;
	}
}
