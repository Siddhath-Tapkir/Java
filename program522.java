import java.util.*;

class program522
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

        int iMax = 0;
        String MaxStr = null;
        for(int i = 0; i < tockens.length; i++)
        {
            if(iMax < tockens[i].length())
            {
                iMax = tockens[i].length();
                MaxStr = tockens[i];
            }
        }
        System.out.println("Largest word is : "+MaxStr+" with lenght : "+iMax);
    }
}