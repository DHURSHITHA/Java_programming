class Solution {
    int func(String s,int index1,String t,int index2,int[][] memoi)
    {
        if(index1>=s.length()||index2>=t.length()) return 0;
        if(memoi[index1][index2]!=-1) return memoi[index1][index2];
        int c=0,lc=0,rc=0;
        if(s.charAt(index1)==t.charAt(index2))
        {
            return 1+func(s,index1+1,t,index2+1,memoi);
        }
        else
        {
            lc=func(s,index1+1,t,index2,memoi);
            rc=func(s,index1,t,index2+1,memoi);
        }
        memoi[index1][index2]=Math.max(lc,rc);
        return Math.max(lc,rc);
    }
    int func_call(String s,int index1,String t,int index2)
    {
        int[][] memoi=new int[s.length()][t.length()];
        for(int[] row:memoi)
        {
            Arrays.fill(row,-1);
        }
        return func(s,index1,t,index2,memoi);
    }
    public int minDistance(String word1, String word2) {
        int val= func_call(word1,0,word2,0);
        return word1.length()-val+word2.length()-val;
    }
}
