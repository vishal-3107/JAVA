public class variableArguments2 {

    static void show(int count, String ...S)
    {
        for(int i=0; i<S.length; i++)
        {
            System.out.println(count + ". " + S[i]);
            count++;
        }
    }

    public static void main(String[] args)
    {
        show(5,"Amit", "Alfred", "Rishi", "Sunak");
    }
}
