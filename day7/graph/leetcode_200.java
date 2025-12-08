//union find
class Solution {
    void min(int[][] arr,int val1,int val2)
    {
        int min_val=Math.min(val1,val2);
        int max_val=Math.max(val1,val2);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==max_val)
                {
                    arr[i][j]=min_val;
                }
            }
        }
        
    }
    void func(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]!=0)
                {
                    if(i+1<arr.length&&arr[i+1][j]!=0)
                    {
                        min(arr,arr[i][j],arr[i+1][j]);
                    }
                    if(j+1<arr[0].length&&arr[i][j+1]!=0)
                    {
                        min(arr,arr[i][j],arr[i][j+1]);
                    }
                    if(j-1>=0&&arr[i][j-1]!=0)
                    {
                        min(arr,arr[i][j],arr[i][j-1]);
                    }
                    if(i-1>=0&&arr[i-1][j]!=0)
                    {
                        min(arr,arr[i][j],arr[i-1][j]);
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        HashSet<Integer> a=new HashSet<>();
        int[][] arr=new int[grid.length][grid[0].length];
        int y=1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1') arr[i][j]=y++;
                else arr[i][j]=0;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        func(arr);
         for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(arr[i][j]!=0) a.add(arr[i][j]);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        return a.size();
        
    }
}
