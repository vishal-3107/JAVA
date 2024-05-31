public class WebsiteAndProtocol {
    public static void main(String[] args)
    {      // Problem is to find the protocol used and type of website
        String str = "http://www.google.com";
        String str1 = "https://www.siemens.com";
        String str2 = "ftp://www.hp.com";

        int protocol = str.indexOf(':');
        System.out.println(str.substring(0,protocol));
        int website = str.lastIndexOf('.');
        System.out.println(str.substring(website+1,str.length()));
    }
}
