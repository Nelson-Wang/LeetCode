package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/8.
 */
public class Solution226_2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return root;
    }
}
