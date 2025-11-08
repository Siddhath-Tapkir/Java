import java.util.*;
class StringX
{
    public static void Trim(String str)
    {
        int iStart = 0, iEnd = 0, iCnt = 0;
        char Arr[] = str.toCharArray();
        
        if(Arr[0] == ' ')
        {
            System.out.println("Inside first IF");
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
            System.out.println("Inside Second IF");
            while((Arr[iCnt] == ' '))
            {
                iCnt--;
            }
        }
        iEnd = iCnt;
        System.out.println("iStart is : "+iStart);
        System.out.println("iEnd is : "+iEnd);
        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }
    }
}

class program486
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();

        StringX.Trim(str);
    }
}