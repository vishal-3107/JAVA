public class stringExample {

    public static void main(String [] args)
    {
        String str = "vishalkumarsingh028@gmail.com";
        int i = str.indexOf("@");
        String userName = str.substring(0,i);
        String domainName = str.substring(i+1,str.length());
        System.out.println(domainName);
        System.out.println(userName);
        int j = domainName.indexOf(".");
        String c = domainName.substring(0,j);
        System.out.println(c);
        System.out.println(c.compareTo("gmail"));


    }
}
