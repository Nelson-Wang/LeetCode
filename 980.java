package typeMoudle.dfs;

/**
 * Created by wWX945273 on 2021/5/12.
 */
public class Solution980 {
    private int sum;
    private int row;
    private int col;
    private int stepSum;
    public int uniquePathsIII(int[][] grid) {
        sum = 0;
        stepSum = 0;
        row = grid.length;
        col = grid[0].length;
        int init_x = 0;
        int init_y = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == 0){
                    stepSum++;
                    continue;
                }
                if (grid[i][j] == 1){
                    init_x = i;
                    init_x = j;
                }
            }
        }
        dfs(grid, init_x, init_y, stepSum);
        return sum;
    }

    public void dfs(int[][] grid, int i, int j, int step){
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == -1 ){
            return;
        }
        if (grid[i][j] == 2){
            if (step == 0){
                sum++;
            }
            return;
        }
        grid[i][j] = -1;
        dfs(grid, i+1, j, step-1);
        dfs(grid, i-1, j, step-1);
        dfs(grid, i, j+1, step-1);
        dfs(grid, i, j-1, step-1);
        grid[i][j] = 0;
//        step += 1;
    }

    public static void main(String[] args) {
        Solution980 solution980 = new Solution980();
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int i = solution980.uniquePathsIII(grid);
        System.out.println(i);
    }
}
