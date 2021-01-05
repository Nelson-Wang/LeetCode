package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/5.
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++){
                Node node = queue.poll();
                level.add(node.val);
                List<Node> childs = node.children;
                while (!childs.isEmpty()){
                    Node child = childs.remove(0);
                    queue.add(child);
                }
            }
            result.add(level);
        }
        return result;
    }
}
