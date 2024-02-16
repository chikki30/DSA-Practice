public class BasicArrays {
    public static void main(String[] args)
    {
        int A[]=new int[10];
        int B[]= {1,2,3,4,5};
        int c[];
        c = new int[10];

        B[2]=9;
        for(int x:B)
        {
            System.out.println(x);
        }
    }
}
