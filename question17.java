import java.util.*;
class Pattern
{
    public void Pattern(String str)
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = (Arr.length - 1); iCnt >= 0; iCnt--)
        {
            for(int jCnt = 0; jCnt < Arr.length;jCnt++)
            {
                if(0 == jCnt)
                {
                    System.out.print(Arr[jCnt]+"\t");
                }
                else if(jCnt <= iCnt)
                {
                    System.out.print(Arr[jCnt]+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
class question17
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