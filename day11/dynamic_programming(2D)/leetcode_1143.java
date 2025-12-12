class Solution {
    int func(String s,int index1,String t,int index2,int[][] memoi)
    {
        if(index1>=s.length()||index2>=t.length()) return 0;
        if(memoi[index1][index2]!=-1) return memoi[index1][index2];
        int lc=0;
        int rc=0;
        if(s.charAt(index1)==t.charAt(index2)) return 1+func(s,index1+1,t,index2+1,memoi);
        else
        {
            lc=func(s,index1+1,t,index2,memoi);
            rc=func(s,index1,t,index2+1,memoi);
        }
        memoi[index1][index2]=Math.max(lc,rc);
        return Math.max(lc,rc);
    }
    int func_call(String text1,String text2)
    {
        int[][] memoi=new int[text1.length()][text2.length()];
        for(int[] row:memoi)
        {
            Arrays.fill(row,-1);
        }
        return func(text1,0,text2,0,memoi);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return func_call(text1,text2);
    }
}
