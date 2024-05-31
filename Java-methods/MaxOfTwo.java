public class MaxOfTwo {
    int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
            return y;
    }


    public static void main(String[] args)
    {
        int a =15; int b =16; int c;
       // c = max(a,b);
       // System.out.println(c);

        MaxOfTwo m = new MaxOfTwo();
        System.out.println((m.max(a,b)));
    }
}
