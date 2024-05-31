public class RemoveExtraSpace {
    public static void main(String[] args)
    {
        String str = "   abc    def   ghi jkl   ";
        String str1 = str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
