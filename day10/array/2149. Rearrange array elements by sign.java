//traversing through the array i and j is just the index not worrying about the elemnt in it k is the index where we access each element and what we do is i will keep track of positive index and j will keep track of negative index if element is positive store it in ith index and make i+=2 to store next posiitve element and same for jth index.

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
