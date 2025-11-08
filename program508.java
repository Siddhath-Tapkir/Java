import java.util.*;

class program508
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string");
        String str = sobj.nextLine();
        
        str = str.trim();

        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of words are : "+(iCount + 1));    
    }
}