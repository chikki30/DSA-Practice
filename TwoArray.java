public class TwoArray {
    public static void main(String[] args)
    {
        //Creating Array of size 9X9
        int A[][]=new int[9][9];

        //Creating 2D array
        int B[][];
        B=new int[5][5];

        int[][]C=new int [5][5];
        int[]D[]=new int[5][5];

        int[] E[],F;
        E=new int[5][5];
        F=new int[5];

        int[] G,H,I;

        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int X[][];
        X=new int[3][];

        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];

        for(int x[]:M)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }

    }
}
