class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int num:nums)
        {
            if(num==0)
            {
                z++;
            }
            else if(num==1)
            {
                o++;
            }
            else
            {
                t++;
            }
        }
        int index=0;
        for(int i=0;i<z;i++)
        {
           nums[index++]=0;
        }
        for(int i=0;i<o;i++)
        {
            nums[index++]=1;
        }
        for(int j=0;j<t;j++)
        {
            nums[index++]=2;
        }
    }
}
