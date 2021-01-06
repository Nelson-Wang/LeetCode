package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/6.
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        int left = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (i == 0){
                    left = node.val;
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return left;
    }
}
