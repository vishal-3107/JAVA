public class ParameterParsing {
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        int a = 15;
        inc(a);
        System.out.println(a);
    }
}
