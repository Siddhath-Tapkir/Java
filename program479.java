// Count the white spaces in a string and return it.
import java.util.*;
class program479
{
    public static void main(String A[])
    {
        String str = null;
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ' ')
            {
                iCount++;
            }
        }
        System.out.println("White spaces in the string is : "+iCount);
    }
}