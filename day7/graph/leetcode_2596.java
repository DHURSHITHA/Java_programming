class Solution {
    boolean func(int[][] grid,int check_row,int check_col)
    {
        if(grid[check_row][check_col]==grid.length*grid[0].length-1) return true;
        int[][] dir={{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
        for(int ind=0;ind<dir.length;ind++)
        {
            int calc_row=check_row+dir[ind][0];
            int calc_col=check_col+dir[ind][1];
            if(calc_row>=0&&calc_row<grid.length&&calc_col>=0&&calc_col<grid[0].length&&grid[check_row][check_col]+1==grid[calc_row][calc_col])
            {
                boolean ret_val=func(grid,calc_row,calc_col);
                if(ret_val==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return func(grid,0,0);
    }
}
