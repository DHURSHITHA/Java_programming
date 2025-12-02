class Solution {
    public char kthCharacter(int k) {
        int count=0;
        int pow_of_two=1;
        while(pow_of_two<k)
        {
            pow_of_two*=2;
        }
        pow_of_two/=2;
        //System.out.println(pow_of_two);
        while(k>1)
        {
            if(k-pow_of_two>0)
            {
                count++;
                k-=pow_of_two;
                //System.out.println(pow_of_two);
            }
            pow_of_two/=2;
        }
        System.out.println(count);
        return (char)(97+count);
        
    }
}