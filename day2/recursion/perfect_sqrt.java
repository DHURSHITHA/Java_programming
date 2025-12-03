class Main {
    public static boolean func(int pow,int num)
    {
        if(pow==num) return true;
        if(pow>num) return false;
        return func(pow*2,num);
    }
    public static void main(String[] args) {
        int num=16;
        System.out.print(func(1,num));
    }
}