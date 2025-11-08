// Count the white spaces in a string and return it.
import java.util.*;
class program480
{
    public static void main(String A[])
    {
        String str = null;
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("White spaces in the string is : "+iCount);
    }
}