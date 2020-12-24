package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/24.
 */
public class Solution144 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return result;
    }

    private void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        result.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
