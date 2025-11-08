import java.util.*;
class Matrix
{
    public void ReverseCols(int Arr[][], int iRow, int iCol)
    {
        int iTemp = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol - 1; j+=2)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i][j + 1];
                Arr[i][j + 1] = iTemp;
            }
        }
    }
}

class question22
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Matrix mobj = new Matrix();
        int iRow = 0, iCol = 0;

        System.out.println("Enter rows");
        iRow = sobj.nextInt();

        System.out.println("Enter cols");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the elements");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        mobj.ReverseCols(Arr,iRow,iCol);

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}