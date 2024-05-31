import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int originalNumber = a;
        String s = Integer.toString(a);
        int l = s.length();
        double sum = 0;
        int i = 0;
        while (i < l) {
            int rem = a % 10;
            sum = sum + Math.pow(rem, l);
            int quo = a / 10;
            a = quo;
            i++;
        }
        if(originalNumber==sum)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
