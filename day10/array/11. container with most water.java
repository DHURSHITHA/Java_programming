class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=-1;
        while(i<j)
        {
            int ans=Math.min(height[i],height[j])*Math.abs(i-j);
            if(ans>max)
            {
                max=ans;
            }
            if(height[i]<=height[j])
            {
                i++;
            }
            else if(height[i]>height[j])
            {
                j--;
            }
        }
        return max;
        
    }
}
