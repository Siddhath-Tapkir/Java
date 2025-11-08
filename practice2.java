import java.io.*;
import MarvellousLB.MarvellousPattern.PatternX;
class practice2
{   
    public static void main(String A[])
    {
        BufferedReader bKeyboard = new BufferedReader(new InputStreamReader(System.in));
        int iVal1 = 0, iVal2 = 0;

        System.out.println("Enter number of rows");
        try
        {
            iVal1 = Integer.parseInt(bKeyboard.readLine());
        }
        catch(Exception i)
        {}
        System.out.println("Enter number of Coloumns");
        try
        {
            iVal2 = Integer.parseInt(bKeyboard.readLine());
        }
        catch(Exception o)
        {}
        PatternX pobj = new PatternX(iVal1, iVal2);
        pobj.IfPattern(); 
    }
}