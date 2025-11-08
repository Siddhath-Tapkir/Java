import java.util.*;
class StringX
{
    public static String Trim(String str)
    {
        int iStart = 0, iEnd = 0, iCnt = 0;
        char Arr[] = str.toCharArray();
        
        if(Arr[0] == ' ')
        {
            while((Arr[iCnt] == ' ') && (iCnt < Arr.length))
            {
                iCnt++;
            }
        }
        iStart = iCnt;
        iCnt = 0;
        iCnt = Arr.length - 1;
        if(Arr[Arr.length - 1] == ' ')
        {
            while((Arr[iCnt] == ' '))
            {
                iCnt--;
            }
        }
        iEnd = iCnt;

        char Brr[] = new char[iEnd - iStart + 1];
        int j = 0;
        for(iCnt = iStart, j = 0; iCnt <= iEnd; iCnt++,j++)
        {
            Brr[j] = Arr[iCnt];
        }

        return new String(Brr);
    }
}

class program487
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();

        String sRet = StringX.Trim(str);
        System.out.println("Updated string is : "+sRet);
        System.out.println("Updated string is : "+sRet.length());
    }
}