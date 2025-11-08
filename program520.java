import java.util.*;

class program520
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string");
        
        String str = sobj.nextLine();
        
        str = str.trim();
        int iCount = 0;

        str = str.replaceAll("\\s+"," ");

        String tockens[] = str.split(" ");

        for(int i = 0; i < tockens.length; i++)
        {
            System.out.println(tockens[i]);
        }
    }
}