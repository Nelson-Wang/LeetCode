package com;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2021/1/7.
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        helper(result, String.valueOf(root.val), root);
        return result;
    }

    public void helper(List<String> result, String path, TreeNode root){
        if (root.left == null && root.right == null){
            result.add(path);
        }
        if (root.left != null){
            helper(result, path + "->" + String.valueOf(root.left.val), root.left);
        }
        if (root.right != null){
            helper(result, path + "->" + String.valueOf(root.right.val), root.right);
        }
    }
}
