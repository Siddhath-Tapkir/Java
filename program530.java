import java.util.*;
// abcdefg hijk
// gfedcba kjih
class program530
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string");
        
        String str = sobj.nextLine();
        
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tockens[] = str.split(" ");

        StringBuilder sb = null; 
        for(String s : tockens)
        {
            sb = new StringBuilder(s);
            System.out.println(sb.reverse());
        }
    }
}