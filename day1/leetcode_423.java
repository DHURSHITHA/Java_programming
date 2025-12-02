class Solution {
    public String originalDigits(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                int avl_count=map.get(ch);
                map.put(ch,avl_count+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.print(map);
        int[] arr=new int[10];
        while(map.getOrDefault('z', 0) > 0)
        {
            String word="zero";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[0]++;
        }
        while(map.getOrDefault('w', 0) > 0)
        {
            String word="two";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[2]++;
        }
        while(map.getOrDefault('u', 0) > 0)
        {
            String word="four";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[4]++;
        }
        while(map.getOrDefault('x', 0) > 0)
        {
            String word="six";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[6]++;
        }
        while(map.getOrDefault('g', 0) > 0)
        {
            String word="eight";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[8]++;
        }
        while(map.getOrDefault('o', 0) > 0)
        {
            String word="one";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[1]++;
        }
        while(map.getOrDefault('t', 0) > 0)
        {
            String word="three";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[3]++;
        }
        while(map.getOrDefault('f', 0) > 0)
        {
            String word="five";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[5]++;
        }
        while(map.getOrDefault('s', 0) > 0)
        {
            String word="seven";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[7]++;
        }
        while(map.getOrDefault('n', 0) > 0)
        {
            String word="nine";
            for(int i=0;i<word.length();i++)
            {
                int avl_count=map.get(word.charAt(i));
                map.put(word.charAt(i),avl_count-1);
                if(avl_count==1)
                {
                    map.remove(word.charAt(i));
                }
            }
            arr[9]++;
        }
        System.out.print(map);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                for(int j=0;j<arr[i];j++)
                {
                    ans.append((char)(i+'0'));
                }
            }
        }
        return ans.toString();
    }
}
