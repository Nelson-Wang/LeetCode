package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wWX945273 on 2020/12/24.
 */
public class Solution589 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preorderHelp(root);
        return result;
    }

    private void preorderHelp(Node root){
        if (root == null){
            return;
        }
        result.add(root.val);
        for (Node chirld : root.children){
            preorderHelp(chirld);
        }
    }
}
