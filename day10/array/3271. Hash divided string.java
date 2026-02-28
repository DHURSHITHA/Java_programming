class Solution {
    public String stringHash(String s, int k) {
        int count=0;
        StringBuilder res=new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            count+=(s.charAt(i)-'0')-49;
           // System.out.println(count);
            if((i+1)%k==0)
            {
                int temp=(count%26)+49;
                res.append((char)(temp+'0'));
                //System.out.println((char)(temp+'0')+" "+temp+" "+count);
                count=0;
            }
        }
        return res.toString();
    }
}
