class Solution {
    int func(String s,int index1,String t,int index2,int[][] memoi)
    {
        if(index2>=t.length()) return 1;
        if(index1==s.length()) 
        {
            return 0;
        }
        if(memoi[index1][index2]!=-1) return memoi[index1][index2];
        int tot=0;
        if(s.charAt(index1)==t.charAt(index2))
        {
            int x=func(s,index1+1,t,index2+1,memoi);
            int y=func(s,index1+1,t,index2,memoi);
            tot=x+y;
        }
        else
            tot=func(s,index1+1,t,index2,memoi);
        memoi[index1][index2]=tot;
        return tot;
    }
    int rec_call(String s,int index1,String t,int index2)
    {
        int[][] memoi=new int[s.length()][t.length()];
        for(int[] row:memoi)
        {
            Arrays.fill(row,-1);
        }
        return func(s,0,t,0,memoi);
    }
    public int numDistinct(String s, String t) {
        return rec_call(s,0,t,0);
    }
}
