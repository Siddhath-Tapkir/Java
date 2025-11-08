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
        // String(Array_Name, Starting_Index, count)
        return new String(Arr,iStart,iEnd - iStart + 1);
    }
}

class program489
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();
        char Arr[] = {'a','b','c','d','e','f'};

        String sRet = StringX.Trim(str);
        //System.out.println("Updated string is : "+sRet);
        //System.out.println("string length is : "+sRet.length());
    }
}