import java.util.*;
public class InsertingElementAtPosition {
    public static void main(String[] args)
    {
        int[] A = {22,23,24,25,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index on which you want to insert the element");
        System.out.println("Enter the value you want to insert");
        int value = sc.nextInt();
        int i = sc.nextInt();
        if(A.length-1 <= i)
        {
            for(int j=A.length-1; j<i; j++ )
            {
                A[j-1] = A[j];
            }
            A[i] = value;
        }
        for(int k : A)
        {
            System.out.print(k +" ");
        }

    }
}
