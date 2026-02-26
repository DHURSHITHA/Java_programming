class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> arr=new HashSet<>();
        int min=1000,max=-1;
        for(int num:nums)
        {
            arr.add(num);
            if(min>num)
            {
                min=num;
            }
            else if(max<num)
            {
                max=num;
            }
        }
        for(int i=min;i<=max;i++)
        {
            if(arr.contains(i))
            {
                continue;
            }
            else
            {
                a.add(i);
            }
        }
        return a;
    }
}
