public class BinaryNumber {
    public static void main(String[] args)
    {
        String str = "100"; // Binary
        System.out.println(str.matches("[0-1]*")); // Binary
        String hex = "A7B"; // Hexadecimal
        System.out.println(hex.matches("[0-9A-F]*")); // Hexadecimal
        String date = "31/07/2001";
        System.out.println(date.matches("[1-31]/[01-12]/[0-9]{4}"));
    }
}
