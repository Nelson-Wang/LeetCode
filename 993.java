package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/6.
 */
public class Solution993 {
    public int[] find(TreeNode root,int num){
        int[] ints = new int[2];
        if (root == null){
            return ints;
        }
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (node.left != null && node.left.val == num || node.right != null && node.right.val == num){
                    ints[0] = level + 1;
                    ints[1] = node.val;
                    return ints;
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            level++;
        }
        return ints;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        int[] xints = find(root, x);
        int[] yints = find(root, y);
        if (xints[0] == yints[0] && xints[1] != yints[1]){
            return true;
        }
        return false;
    }
}
