class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set1=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++)
        {
            set1.add(brokenLetters.charAt(i));
        }
        int count=0;
        boolean start=true;
        for(int i=0;i<text.length();i++)
        {
            if(set1.contains(text.charAt(i)))
            {
                start=false;
            }
            else if(text.charAt(i)==' ')
            {
                if(start)
                {
                    count++;
                }
                else
                {
                    start=true;
                }
            }
        }
        if(start)
        {
            count++;
        }
        return count;
        
    }
}
