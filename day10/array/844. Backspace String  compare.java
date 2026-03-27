class Solution {
    public String check(String s)
    {
        StringBuilder sb=new StringBuilder();
        Stack stck=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                stck.push(s.charAt(i));
            }
            else
            {
                if(!stck.isEmpty())
                stck.pop();
            }
        }
        while(!stck.isEmpty())
        {
            sb.append(stck.pop());
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        if(check(s).equals(check(t)))
        {
            return true;
        }
        return false;
    }
}
