class Solution {
    int left(char[][] board,int r,int c)
    {
        for(int i=c;i>=0;i--)
        {
            if(board[r][i]=='p') return 1;
            else if(board[r][i]=='B') return 0;
        }
        return 0;
    }
    int right(char[][] board,int r,int c)
    {
        for(int i=c;i<=7;i++)
        {
            if(board[r][i]=='p') return 1;
            else if(board[r][i]=='B') return 0;
        }
        return 0;
    }
    int top(char[][] board,int r,int c)
    {
        for(int i=r;i>=0;i--)
        {
            if(board[i][c]=='p') return 1;
            else if(board[i][c]=='B') return 0;
        }
        return 0;
    }
    int down(char[][] board,int r,int c)
    {
        for(int i=r;i<=7;i++)
        {
            if(board[i][c]=='p') return 1;
            else if(board[i][c]=='B') return 0;
        }
        return 0;
    }
    public int numRookCaptures(char[][] board) {
        int r=-1,c=-1;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='R')
                {
                    r=i;
                    c=j;
                    break ;
                }
            }
        }
        int ans=0;
        ans+=left(board,r,c-1);
        System.out.println(ans);
        ans+=top(board,r-1,c);
        System.out.println(ans);
        ans+=right(board,r,c+1);
        System.out.println(ans);
        ans+=down(board,r+1,c);
        System.out.println(ans);
        return ans;

    }
}
