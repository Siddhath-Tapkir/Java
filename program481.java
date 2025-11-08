import java.util.*;
class program481
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                Arr[iCnt] = '_';
            }
        }
        String newstr = new String(Arr);
        System.out.println("Updated string is : "+newstr);
    }
}