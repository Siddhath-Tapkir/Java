import java.util.*;
// hello demo madam nayan ppa level for radar
// madam nayan level radar
class program534
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string");
        
        String str = sobj.nextLine();
        str = str.trim();

        str = str.replaceAll("\\s+"," ");
        
        String tocken[] = str.split(" ");
        
        StringBuilder sb = null;
        for(String s : tocken)
        {
            sb = new StringBuilder(s);

            sb.reverse();

            if(s.equals(new String(sb)))
            {
                System.out.println(s);
            }
        }
    }
}