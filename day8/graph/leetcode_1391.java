class Solution {
    void func(int[][] grid,int val1,int i,int j,Stack<int[]> a,boolean[][] visited)
    {
        if(val1==1)
        {
            if(j+1<grid[0].length)
            {
                if(grid[i][j+1]==3||grid[i][j+1]==5||grid[i][j+1]==1){
                    if(!visited[i][j+1])
                    {
                         a.add(new int[]{i,j+1});
                         //visited[i][j+1]=true;
                    }
                }
            }
            if(j-1>=0)
            {
                if(grid[i][j-1]==4||grid[i][j-1]==6||grid[i][j-1]==1) {
                    if(!visited[i][j-1])
                    {
                        a.add(new int[]{i,j-1});
                        //visited[i][j-1]=true;
                    }
                }
            }
        }
        if(val1==2)
        {
            if(i-1>=0)
            {
                if(grid[i-1][j]==4||grid[i-1][j]==3||grid[i-1][j]==2){
                    if(!visited[i-1][j]) 
                    {
                        a.add(new int[]{i-1,j});
                        //visited[i-1][j]=true;
                    }
                }
            }
            if(i+1<grid.length)
            {
                if(grid[i+1][j]==6||grid[i+1][j]==5||grid[i+1][j]==2) {
                    if(!visited[i+1][j])
                    {
                        a.add(new int[]{i+1,j});
                        //visited[i+1][j]=true;
                    }
                }
            }
        }
        if(val1==3)
        {
            if(j-1>=0)
            {
                if(grid[i][j-1]==4||grid[i][j-1]==6||grid[i][j-1]==1){
                    if(!visited[i][j-1])
                    {
                         a.add(new int[]{i,j-1});
                         //visited[i][j-1]=true;
                    }
                }
            }
            if(i+1<grid.length)
            {
                if(grid[i+1][j]==2||grid[i+1][j]==5||grid[i+1][j]==6){
                    if(!visited[i+1][j])
                    {
                        a.add(new int[]{i+1,j});
                        //visited[i+1][j]=true;
                    }
                }
            }
        }
        if(val1==4)
        {
            if(j+1<grid[0].length)
            {
                if(grid[i][j+1]==1||grid[i][j+1]==3||grid[i][j+1]==5){
                    if(!visited[i][j+1])
                    {
                     a.add(new int[]{i,j+1});
                     //visited[i][j+1]=true;
                    }
                }
            }
            if(i+1<grid.length)
            {
                if(grid[i+1][j]==2||grid[i+1][j]==5||grid[i+1][j]==6){
                    if(!visited[i+1][j])
                    {
                         a.add(new int[]{i+1,j});
                        // visited[i+1][j]=true;
                    }
                }
            }
        }
        if(val1==5)
        {
            if(j-1>=0)
            {
                if(grid[i][j-1]==1||grid[i][j-1]==6||grid[i][j-1]==4){
                    if(!visited[i][j-1])
                    {
                        a.add(new int[]{i,j-1});
                        //visited[i][j-1]=true;
                    }
                }
            }
            if(i-1>=0)
            {
                if(grid[i-1][j]==2||grid[i-1][j]==4||grid[i-1][j]==3){
                    if(!visited[i-1][j])
                    {
                         a.add(new int[]{i-1,j});
                         //visited[i-1][j]=true;
                    }
                }
            }
        }
        if(val1==6)
        {
            if(j+1<grid[0].length)
            {
                if(grid[i][j+1]==1||grid[i][j+1]==5||grid[i][j+1]==3){
                    if(!visited[i][j+1])
                    {
                         a.add(new int[]{i,j+1});
                        // visited[i][j+1]=true;
                    }
                }
            }
            if(i-1>=0)
            {
                if(grid[i-1][j]==2||grid[i-1][j]==4||grid[i-1][j]==3) {
                    if(!visited[i-1][j])
                    {
                        a.add(new int[]{i-1,j});
                        //visited[i-1][j]=true;
                    }
                }
            }
        }

    }
    boolean dfs(int[][] grid,int i,int j,boolean[][] visited)
    {
        Stack<int[]> a=new Stack<>();
        a.push(new int[]{i,j});
        while(!a.isEmpty())
        {
            int[] arr=a.pop();
            visited[arr[0]][arr[1]]=true;
            int val=grid[arr[0]][arr[1]];
            if(arr[0]==grid.length-1&&arr[1]==grid[0].length-1) return true;
            func(grid,val,arr[0],arr[1],a,visited);

        }
        return false;
    }
    public boolean hasValidPath(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        return dfs(grid,0,0,visited);

       
        
    }
}
