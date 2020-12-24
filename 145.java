package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/24.
 * 二叉后序遍历
 * 递归写法
 */
public class Solution145 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return result;
    }
    //把root为根的postorder的前序遍历放入result里面
    private void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        result.add(root.val);
    }
}
