class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder();
        int index=0;
        str.append(s.charAt(index++));
        int count=1;
        while(index<s.length())
        {
            if(s.charAt(index)==s.charAt(index-1))
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<3)
            {
                str.append(s.charAt(index));
            }
            index++;
        }
        return str.toString();

    }
}
