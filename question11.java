import java.util.*;
class Pattern
{
    public void Pattern(String str)
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = 1; iCnt <= (Arr.length - 1); iCnt++)
        {
            for(int jCnt = 1; jCnt <= Arr.length;jCnt++)
            {
                System.out.print(Arr[jCnt - 1]+"\t");
            }
            System.out.println();
        }
    }
}
class question11
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter your word");
        str = sobj.nextLine();
        pobj.Pattern(str);

    }
}