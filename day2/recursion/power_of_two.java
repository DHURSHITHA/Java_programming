class Main {
    public static boolean func(int num)
    {
        if(num==1)
        {
            return true;
        }
        if(num%2!=0||num<0)
        {
            return false;
        }
        return func(num/2);
    }
    public static void main(String[] args) {
        int num=100;
        System.out.print(func(num));
    }
}