import java.util.*;
 
//_ _ _India_ _ _ _is_ _my_country_ _ _ _
// After trim :India is my country
class program511
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string");
        String str = sobj.nextLine();
        
        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];

        int iCount = 0, jCnt = 0, iCnt = 0;
        boolean bFlag = false;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                Brr[jCnt] = Arr[iCnt];
                jCnt++;
                bFlag = false;
            }
            else if(Arr[iCnt] == ' ')
            {
                if(false == bFlag)
                {
                    Brr[jCnt] = ' ';
                    jCnt++;
                    bFlag = true;
                }
            }
        }
        String Output = new String(Brr);

        Output = Output.trim();
        
        char Crr[] = Output.toCharArray();

        for(iCnt = 0; iCnt < Crr.length; iCnt++)
        {
            if(Crr[iCnt] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of words are : "+(iCount + 1));
    }
}