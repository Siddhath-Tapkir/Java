import java.util.*;

class program490
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();
        char Arr[] = {'a','b','c','d','e','f'};

        String sRet = str.trim();
        System.out.println("Updated string is : "+sRet);
        System.out.println("string length is : "+sRet.length());
    }
}