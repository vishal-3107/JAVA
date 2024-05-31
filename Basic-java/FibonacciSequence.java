import java.util.Scanner;

import java.util.*;
public class FibonacciSequence {

    public static void main(String[] args)
    {
        System.out.println("Enter the number till which you want to print fibonacci Sequence");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 0; i<=num; i++)
        {
           int  c = a+b;
           System.out.print(c+" " );
            a = b;
            b = c;
        }

    }
}
