class Solution {
    void func(int[][] grid)
    {
        int last=grid[grid.length-1][grid[0].length-1],r=0,c=0;
        int prev=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0&&j==0)
                {
                    prev=grid[i][j];
                    grid[i][j]=last;
                }
                else
                {
                    int temp=grid[i][j];
                    grid[i][j]=prev;
                    prev=temp;
                }
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(int i=0;i<k;i++)
        func(grid);
        ArrayList<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                row.add(grid[i][j]);
            }
            arr.add(row);
        }
        return arr;
    }
}
