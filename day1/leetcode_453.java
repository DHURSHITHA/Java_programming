class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int total=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<min)
        {
            min=nums[i];
        }
         total+=nums[i];
       }
       return total-(nums.length*min);
    }
}