class Solution {
    public String decodeMessage(String key, String message) {
        Set<Character> s=new LinkedHashSet<>();
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            if(ch!=' '&&!s.contains(ch))
            {
                s.add(ch);
            }
        }
        HashMap<Character,Character> map=new HashMap<>();
        int ind=0;
        for(Character c:s)
        {
            map.put(c,(char)(97+ind));
            ind++;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<message.length();i++)
        {
            if(map.get(message.charAt(i))!=null)
            ans.append(map.get(message.charAt(i)));
            else
            ans.append(" ");
        }
        return ans.toString();
    }
}
