public class SwitchCaseStatement {
    public static void main(String[] args)
    {
        String str = "open";
        switch (str)
        {
            case "exit" : System.out.println("save the file");
                          break;
            case "open" : System.out.println("Open the file");
                          break;
        }
    }
}
