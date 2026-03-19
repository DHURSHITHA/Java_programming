class Solution {
    public String trimTrailingVowels(String s) {
        int ind=-1;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                ind=i;
            }
            else
            {
                break;
            }
        }
        if(ind==-1)
        {
            ind=s.length();
        }
        for(int i=0;i<ind;i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
