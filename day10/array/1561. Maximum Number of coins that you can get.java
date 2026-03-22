class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        for(int i=1;i<=piles.length/3;i++)
        {
            sum+=piles[piles.length-(i*2)];
        }
        return sum;
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int i=0;i<piles.length;i++)
        // {
        //     arr.add(piles[i]);
        // }
        // Collections.sort(arr);
        // System.out.print(arr);
        // int sum=0;
        // int temp=piles.length/3;
        // int index=2;
        // for(int i=0;i<temp;i++)
        // {
        //     sum+=arr.get(piles.length-index);
        //     index+=2;
            
        // }
        // return sum;
        
    }
}
