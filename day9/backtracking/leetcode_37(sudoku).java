class Solution {
    char[][] res=new char[9][9];
    boolean isValid(char[][] board,int r,int c,char ch)
    {
        int b_row=(r/3)*3;//boundary check row
        int b_col=(c/3)*3;//boundary check col
        for(int i=0;i<9;i++)
        {
            if(board[r][i]==ch) return false;//check in row if already that digit is existing
        }
        for(int i=0;i<9;i++)
        {
            if(board[i][c]==ch) return false;//check in col if already that digit is existing
        }
        for(int i=b_row;i<b_row+3;i++)
        {
            for(int j=b_col;j<b_col+3;j++)
            {
                if(board[i][j]==ch) return false;//check in boundary 3*3 box
            }
        }
        return true;
    }
    void func(char[][] board,int r,int c,boolean[][] visited)
    {
        if(c==9)//if it reaches the last column go to next row
        {
            r+=1;
            c=0;
        }
        if(r==9)//if it reaches the last row we got answer take a copy of answer
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board.length;j++)
                {
                    res[i][j]=board[i][j];
                }
                
            }
            return;
        }
         if(visited[r][c])//if the cell is already filled skip it
            {
                func(board,r,c+1,visited);
            }
        for(char i='1';i<='9';i++)//else check for the correct digit to place
        {
            if(!visited[r][c])
            {
                if(isValid(board,r,c,i))
                {
                    board[r][c]=i;
                    visited[r][c]=true;//do
                    func(board,r,c+1,visited);//undo
                    visited[r][c]=false;//undo(backtracking)
                    board[r][c]='.';//undo(backtracking)

                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
        boolean[][] visited=new boolean[9][9];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]!='.')
                {
                    visited[i][j]=true;
                }
            }
        }
        func(board,0,0,visited);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                   board[i][j]=res[i][j];
            }
                
        }
    }
}
