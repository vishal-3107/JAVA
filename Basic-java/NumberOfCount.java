public class NumberOfCount {

        public static void main(String[] args)
        {
            int num = 1;
            int count = 0;
            int[] arr = {2,3,2,3,5};
            int[] a = new int[5];
            for(int i=0; i<=arr.length-1; i++)
            {
                if(num==arr[i])
                {
                    count+=1;
                }
                else if(i==arr.length-1)
                {
                    num+=1;
                    int k = 0;
                    a[k] = count;
                    k+=1;
                    count =0;
                }
            }

            for(int x:a)
            {
                System.out.print(x + " ");
            }



        }
    }

