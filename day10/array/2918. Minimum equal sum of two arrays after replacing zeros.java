class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long n1=0,z1=0,n2=0,z2=0;
        for(int num:nums1)
        {
            if(num==0)
            {
                z1+=1;
            }
            n1+=num;
        }
        for(int num:nums2)
        {
            if(num==0)
            {
                z2+=1;
            }
            n2+=num;
        } 
        if(n1+z1>n2&&z2==0) return -1;
        if(n2+z2>n1&&z1==0) return -1;
        long target = Math.max(n1 + z1, n2 + z2);
        return target;
    }
}
