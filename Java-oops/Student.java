public class Student {
    public int roll;
    public String name;
    public String course;
    public int m1; int m2; int m3;
    public double total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return total()/3;
    }
    public String grade()
    {
        double percentage = (total()/300)*100;
        if(percentage>60)
        {
            return "First Division";
        }
        else {
            return "Second division";
        }
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        s.roll = 1;
        s.name = "Shubham";
        s.course = "CSE";
        s.m1 = 75;
        s.m2= 80;
        s.m3 = 90;
        System.out.printf("%.2f%n",s.average());
        System.out.println(s.grade());

    }
}
