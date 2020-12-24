package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/24.
 */
public class Solution590 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        postorderHelp(root);
        return result;
    }

    private void postorderHelp(Node root){
        if (root == null){
            return;
        }
        for (Node chirld : root.children){
            postorderHelp(chirld);
        }
        result.add(root.val);
    }
}
