import java.util.*;
public class FactorialNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        if(a==0)
        {
            System.out.println(fact);
        }
        else {
            for(int i = 1; i<=a ; i++)
            {
                fact = fact*i;
            }
            System.out.println(fact);
        }

    }
}
