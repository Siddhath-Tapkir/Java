import java.io.*;
class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for(int jCnt = 1; jCnt <= iCol; jCnt++)
            {    
               System.out.print("*\t");         
            }
            System.out.println();
        }
    }
}
class question6
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        Pattern pobj = new Pattern();
        int iRow = 0, iCol = 0;

        try
        {
            System.out.println("Enter Row");

            iRow = Integer.parseInt(bobj.readLine()); 

            System.out.println("Enter cols");

            iCol = Integer.parseInt(bobj.readLine());
        }
        catch(IOException e)
        {}
        pobj.Pattern(iRow,iCol);

        pobj = null;

    }
}