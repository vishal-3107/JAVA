
public class circle {

    public int radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimetre() {
        return 2 * Math.PI * radius;
    }



    public static void main(String[] args)
    {
        circle c = new circle();
        c.radius=15;
        System.out.println(c.area());
        System.out.println(c.perimetre());
    }
}
