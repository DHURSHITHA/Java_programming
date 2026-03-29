class Solution {
    public String removeStars(String s) {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                stck.push(s.charAt(i));
            }
            else
            {
                stck.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stck.isEmpty())
        {
            sb.append(stck.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
