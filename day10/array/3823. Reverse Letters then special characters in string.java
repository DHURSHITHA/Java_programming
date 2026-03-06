class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        ArrayList<Character> arr=new ArrayList<>();
        ArrayList<Character> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            char v=s.charAt(i);
            if(v>='a' && v<='z'){
                arr.add(v);
            }
            else{
                arr1.add(v);
            }
        }
        
        String str="";
        int b=arr.size()-1;
        int k=arr1.size()-1;
        for(int i=0;i<n;i++){
            char v=s.charAt(i);
            if(v>='a' && v<='z'){
                str+=arr.get(b)+"";
                b--;
            }
            else{

                str+=arr1.get(k)+"";
                k--;
            }
        }
        return str;
    }
}
