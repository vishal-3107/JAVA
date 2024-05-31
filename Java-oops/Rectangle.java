public class Rectangle {
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }
    public int perimetre()
    {
        return 2*(length+breadth);
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.length = 15;
        r.breadth = 16;
        System.out.println(r.area());
        System.out.println(r.perimetre());
    }
}
