import java.util.*;

class program497
{
    public static void main(String A[])
    {
        String str = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        str = sobj.nextLine();
        
        int Count[] = new int[26];

        char Arr[] = str.toCharArray();
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Count[Arr[iCnt] - 'a']++;
            }

            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Count[Arr[iCnt] - 'A']++;
            }
        }

        for(int iCnt = 0;iCnt < Count.length; iCnt++)
        {
            if(Count[iCnt] != 0)
            {
                System.out.println("frency of "+(char)(iCnt + 'a')+" is : "+Count[iCnt]);
            }
        }
    }
}