class Solution {
    public String removeOuterParentheses(String s) {
     boolean[] arr=new boolean[s.length()];
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
        arr[i]=false;
     }
     int count=0;
     int start=0;
     for(int i=0;i<s.length();i++)
     {
        if(s.charAt(i)=='(')
        {
            count++;
        }
        else
        {
            count--;
            if(count==0)
            {
                arr[start]=true;
                arr[i]=true;
                start=i+1;
            }
        }
     }
     for(int i=0;i<arr.length;i++)
     {
        if(!arr[i])
        {
            sb.append(s.charAt(i));
        }
     }
     return sb.toString();
   }
}
