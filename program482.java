import java.util.*;
class StringX
{
    public String Replace(String str, char A, char B)
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == A)
            {
                Arr[iCnt] = B;
            }
        }
        String newstr = new String(Arr);

        return newstr;
    }
}
class program482
{
    public static void main(String A[])
    {
        String str = null;
        StringX strobj = new StringX();
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();

        String sRet = strobj.Replace(str,' ','_');
        System.out.println("Updated string is : "+sRet);
    }
}