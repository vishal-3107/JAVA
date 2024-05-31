public class MaxmNumberInArray {

    public static void main(String[] args)
    {
        int[] A = {50,20,100,98,2000,200,55,181};
        int max = A[0];
        for(int i=1; i<A.length; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }

        }
        System.out.println(max);



    }
}
