import java.io.*;
import MarvellousLB.MarvellousNNumbers.NNumberX;
class practice3
{
    public static void main(String[] args) 
    {
        BufferedReader bKeyboard = new BufferedReader(new InputStreamReader(System.in));
        int iSize = 0, iRet = 0;
        System.err.println("Enter no of elements");
        try
        {
            iSize = Integer.parseInt(bKeyboard.readLine());
        }
        catch(Exception i)
        {}
        int iNo[] = new int[iSize];
        System.out.println("Enter elements");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            try
            {
                iNo[iCnt] = Integer.parseInt(bKeyboard.readLine());
            }
            catch(Exception i)
            {}
        }
        NNumberX nobj = new NNumberX(iNo,iSize);
        iRet = nobj.Difference();
        System.out.println("Difference is:"+iRet);
        nobj = null;
        
    }
}