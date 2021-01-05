package com;


import java.util.LinkedList;

import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/5.
 */
public class Solution1161 {
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int max = Integer.MIN_VALUE;
        int index = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            if (sum > max){
                max = sum;
                level = index;
            }
            index++;
        }
        return level;
    }
}
