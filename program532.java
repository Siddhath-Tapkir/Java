import java.util.*;
// abcdefg hijk
// gfedcba kjih
class program532
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
        
        StringBuilder newstr = new StringBuilder();

        for(String s : tockens)
        {
            sb = new StringBuilder(s);
            (newstr.append(sb.reverse())).append(" ");    //newstr = newstr + sb.reverse();
            //newstr.append(" ");             //newstr = newstr + " ";
        }
        String Finalstr = new String(newstr);

        System.out.println(Finalstr.trim());
    }
}