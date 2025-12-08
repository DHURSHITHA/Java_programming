class Solution {
    int func(int[][] grid,boolean[][] visited,int cur_r,int cur_c,int cur_steps)
    {
        Queue<int[]> q=new LinkedList<>();
        Queue<Integer> steps=new LinkedList<>();
        q.add(new int[]{cur_r,cur_c});
        steps.add(cur_steps);
        visited[cur_r][cur_c]=true;
        while(!q.isEmpty())
        {
            int[] cur=q.poll();
            int x=steps.poll();
            int c_r=cur[0];
            int c_c=cur[1];
            int[][] dir={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
            for(int ind=0;ind<dir.length;ind++)
            {
                int calc_r=c_r+dir[ind][0];
                int calc_c=c_c+dir[ind][1];
                if(calc_r>=0&&calc_r<grid.length&&calc_c>=0&&calc_c<grid[0].length&&!visited[calc_r][calc_c]&&grid[calc_r][calc_c]==0)
                {
                    if(calc_r==grid.length-1&&calc_c==grid.length-1) return x+1;
                    visited[calc_r][calc_c]=true;
                    q.add(new int[]{calc_r,calc_c});
                    steps.add(x+1);
                }
            }
        }
        return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==0&&grid.length==1) return 1;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        if(grid[0][0]==1) return -1;
        return func(grid,visited,0,0,1);        
    }
}
