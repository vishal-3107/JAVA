import java.util.*;
public class MenuDrivenProgram {
    public static void main(String[] args)
    {
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");
        System.out.println("Enter two number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        String str = sc.nextLine();
        switch (str)
        {
            case "ADD" : System.out.println(a+b);
                        break;
            case "SUBTRACT" : System.out.println(a-b);
                        break;
            case "MULTIPLY" : System.out.println(a*b);
                        break;
            case "DIVIDE" : System.out.println(a/b);
                        break;
        }
    }
}
