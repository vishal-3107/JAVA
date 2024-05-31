public class variableAruguments {

    static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args)
    {
        show(20,30,40);
        show(new int[]{20,30,40,50});  /*This is called anonymous array-> Array without reference */
    }
}
