package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wWX945273 on 2020/12/24.
 * 二叉前序遍历
 * 非递归写法---使用栈结构
 */
public class Solution144_2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            //先进后出
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
