import java.util.*;
class Matrix
{
    public int SumBorder(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0, j = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {            
                if(i == 0 || i == iRow - 1 || j == 0 || j == iCol - 1)
                {
                    iSum += Arr[i][j];
                }
            }
        }
        return iSum;
    }
}

class question24
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
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(mobj.SumBorder(Arr,iRow,iCol));

        
    }
}