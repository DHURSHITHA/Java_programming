class Solution {
    int memoi_approach(int n,int[] memoi)
    {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        if(memoi[n]!=-1) return memoi[n];
        int val=memoi_approach(n-3,memoi)+memoi_approach(n-2,memoi)+memoi_approach(n-1,memoi);
        memoi[n]=val;
        return memoi[n];
    }
    int wrapper_func(int n)
    {
        int[] memoi=new int[n+1];
        Arrays.fill(memoi,-1);
        return memoi_approach(n,memoi);
    }
    public int tribonacci(int n) {
        return wrapper_func(n);    
    }
}
