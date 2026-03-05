class Solution {
    public int totalHammingDistance(int[] nums) {
        int n,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                n=nums[i]^nums[j];
                ans+=Integer.bitCount(n);
            }
        }
        return ans;
    }
}
