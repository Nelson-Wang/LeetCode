package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/24.
 * 二叉中序遍历
 * 递归写法
 */
public class Solution94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return result;
    }
    ////把root为根的inorder的前序遍历放入result里面
    private void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }
}
