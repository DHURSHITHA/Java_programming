// The 2D array should contain only the elements of the array nums.
// Each row in the 2D array contains distinct integers.
// The number of rows in the 2D array should be minimal.

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer> arr=new HashMap<>();
        for(int num:nums)
        {
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }     
        int max=-1;
        for(Integer key:arr.keySet())
        {
            if(arr.get(key)>max)
            {
                max=arr.get(key);
            }
        } 
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<max;i++)
        {
            a.add(new ArrayList<>());
        }
        for(Integer key:arr.keySet())
        {
            int k=key;
            int n=arr.get(key);
            for(int i=0;i<n;i++)
            {
                a.get(i).add(k);
            }
        }  
        return a;
    }
}
