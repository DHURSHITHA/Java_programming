class Solution {
    public int[] diStringMatch(String s) {
        int low=0,high=s.length();
        int[] arr=new int[s.length()+1];
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[index++]=low;
                low++;
            }
            else
            {
                arr[index++]=high;
                high--;
            }
        }
        arr[index++]=high;
        return arr;
        
    }
}
