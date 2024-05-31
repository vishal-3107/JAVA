import java.util.*;
public class RadixOfString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("[0-1]*"))
        {
            System.out.println("Binary");
        }
        else if(str.matches("[0-7]*"))
        {
            System.out.println("Octal");
        }
        else if(str.matches("[0-9A-F]*"))
        {
            System.out.println("Hexadecimal");
        }
    }
}
