package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/6.
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int right = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (i == size - 1){
                    right = node.val;
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(right);
        }
        return result;
    }
}
