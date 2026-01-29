class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=1,k=0;
        int arr[]=new int[nums.length];
        while(k<nums.length){
            if(nums[k]>0){
                arr[i]=nums[k];
                i=i+2;
            }
            else{
                arr[j]=nums[k];
                j=j+2;
            }
            k++;
        }
        return arr;

    }
}
