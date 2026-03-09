class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r=0,c=0;
        for(String str:commands)
        {
            if(str.equals("RIGHT"))
            {
                c+=1;
            }
            else if(str.equals("DOWN"))
            {
                r+=1;
            }
            else if(str.equals("UP"))
            {
                r-=1;
            }
             else if(str.equals("LEFT"))
            {
                c-=1;
            }
        }
        return r*n+c;
        
    }
}
