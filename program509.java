import java.util.*;
 
//_ _ _India_ _ _ _is_ _my_country_ _ _ _
// After trim :India is my country
class program509
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
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                Brr[jCnt] = Arr[iCnt];
                jCnt++;
            }
            else
            {

            }
        }
        String Output = new String(Brr);
        Output = Output.trim();
        System.out.println("Updated string is  : "+Output);
        System.out.println("Length is  : "+Output.length());    
    }
}