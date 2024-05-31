public class MaximumOfThreeNumber {
    public static void main(String[] args)
    {
        int a = 7;
        int b = 6;
        int c = 5;

        if(a>b && a > c)
        {
            System.out.println("a is greatest");
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is greater than c");
            }
            else {
                System.out.println("c is greater among all");
            }
        }
    }
}
