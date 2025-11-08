import java.util.*;

class program485
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();

        String sRet = str.replaceAll("a","A");

        System.out.println("Updated string is : "+sRet);
    }
}