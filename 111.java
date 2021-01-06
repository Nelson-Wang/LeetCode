package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/6.
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                if (node.left == null && node.right == null){
                    return level;
                }
            }
            level++;
        }
        return level;
    }
}
