Given an array ,write a recursive code to print the array elements in forward traversal.
import java.util.*;
public class Main{
    public static void func(int[] arr,int ind)
    {
        if(ind==arr.length)
        {
            return;
        }
        System.out.print(arr[ind]+" ");
        func(arr,ind+1);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        func(arr,0);
    }
}


Given an array ,write a recursive code to print the array elements in reverse traversal.
import java.util.*;
public class Main{
    public static void func(int[] arr,int ind)
    {
        if(ind==arr.length)
        {
            return;
        }
        func(arr,ind+1);
        System.out.print(arr[ind]+" ");
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        func(arr,0);
    }
}

Given an input , write a recursive code to print 7's multiple from 1 till input.
import java.util.*;
public class Main{
    public static void func(int i,int input)
    {
        if(i>input) return;
        System.out.println(i+"*7"+"="+i*7);
        func(i+1,input);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        func(1,n);
    }
}



Given an input , write a recursive code to print factors of the given input.
import java.util.*;
public class Main{
    public static void func(int i,int input,int n)
    {
        if(i>input) return;
        if(n%i==0) System.out.println(i);
        func(i+1,input,n);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        func(1,n/2,n);
    }
}


Write a recursive code to search an element in an array
import java.util.*;
public class Main{
    public static boolean func(int[] arr,int ind,int element)
    {
        if(ind==arr.length) return false;
        if(arr[ind]==element) return true;
        return func(arr,ind+1,element);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int a=scanner.nextInt();
        System.out.print(func(arr,0,a));
    }
}


Write a recursive code to Check for array is sorted or not.
import java.util.*;
public class Main{
    public static boolean func(int[] arr,int ind)
    {
        if(ind>=arr.length/2) return true;
        if(arr[ind]!=arr[arr.length-ind-1]) return false;
        return func(arr,ind+1);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.print(func(arr,0));
    }
}

