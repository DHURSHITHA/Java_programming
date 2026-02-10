class Solution {
    public void rotate(int[] target,int i)
    {
        for(int ind=target.length-1;ind>i;ind--)
        {
            target[ind]=target[ind-1];
        }
    }
    public int[] createTargetArray(int[] nums, int[] index) {
            int[] target=new int[nums.length];
            Arrays.fill(target,-1);
            for(int i=0;i<nums.length;i++)
            {
                if(target[index[i]]==-1)
                {
                    target[index[i]]=nums[i];
                }
                else
                {
                    rotate(target,index[i]);
                    target[index[i]]=nums[i];
                }
            }
            return target;
    }
}
