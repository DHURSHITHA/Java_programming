class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration==0)
        {
            return 0;
        }
        int count=duration;
        for(int i=0;i<timeSeries.length-1;i++)
        {
            if(timeSeries[i]+duration-1>=timeSeries[i+1])
            {
                count=count+(timeSeries[i+1]+duration-1)-(timeSeries[i]+duration-1);
            }
            else
            {
                count+=duration;
            }
        }
        return count;
        
    }
}
