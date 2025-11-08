import java.util.*;

class program496
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
            Count[Arr[iCnt] - 'a']++;
        }

        for(int iCnt = 0;iCnt < Count.length; iCnt++)
        {
            System.out.println("frency of "+(char)(iCnt + 'a')+" is : "+Count[iCnt]);
        }
    }
}