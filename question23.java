import java.util.*;
class Matrix
{
    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        int iTemp = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = i + 1; j < iCol; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = iTemp;
            }
        }
    }
}

class question23
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
        mobj.Transpose(Arr,iRow,iCol);

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