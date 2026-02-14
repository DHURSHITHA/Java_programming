class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1;
        int value=1;
        int i;
        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
            {
                matrix[top][i]=value;
                value+=1;
            } 
            top++;
            for(i=top;i<=bottom;i++)
            {
                matrix[i][right]=value;
                value+=1;
            }
            right--;
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    matrix[bottom][i]=value;
                    value+=1;
                }
            }
            bottom--;
            if(top<=bottom)
            {
                for(i=bottom;i>=top;i--)
                {
                    matrix[i][left]=value;
                    value+=1;
                }
            }
            left++;
        }
        return matrix;
    }
}
