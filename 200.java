package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wWX945273 on 2021/1/6.
 */
public class Solution200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                   bfs(grid, i, j);
                   count++;
                }
            }
        }
        return count;
    }
    private void bfs(char[][] grid, int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()){
            int[] cur = queue.poll();
            int i = cur[0];
            int j = cur[1];
            if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'){
                grid[i][j] = '0';
                queue.add(new int[]{i + 1, j});
                queue.add(new int[]{i - 1, j});
                queue.add(new int[]{i, j + 1});
                queue.add(new int[]{i, j - 1});
            }
        }
    }

    public static void main(String[] args) {
        Solution200 solution200 = new Solution200();
        char[][] grid = {{'1','1','0','0','0'},
                         {'1','1','0','0','0'},
                         {'0','0','1','0','0'},
                         {'0','0','0','1','1'}
                        };
        int i = solution200.numIslands(grid);
        System.out.println(i);
    }
}
