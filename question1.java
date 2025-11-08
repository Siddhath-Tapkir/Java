import java.io.*;
class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        char ch = 'A';
        for(int iCnt = 1; iCnt <= iRow; iCnt++)
        {
            ch = 'A';
            for(int jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
class question1
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