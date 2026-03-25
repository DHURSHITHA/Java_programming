class Solution {
    public String compare(String s1,String s2)
    {
        StringBuilder res=new StringBuilder();
        int min=Math.min(s1.length(),s2.length());
        for(int i=0;i<min;i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                res.append(s1.charAt(i));
            }
            else
            {
                break;
            }
        }
        return res.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String result=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            result=compare(result,strs[i]);
        }
        return result;
    }
}
