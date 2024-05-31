public class ArrayRotation {

    public static void main(String[] args)
    {
        int[] A = {20, 30, 40, 15, 18, 55, 16, 30};
        int temp = A[0];
        for(int i=1; i<A.length; i++)
        {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for(int i : A)
        {
            System.out.print(i + " ");
        }

    }



}
