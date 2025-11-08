import java.util.Scanner;
class MyArray
{
    public int Search(char Arr[], char A)
    {
        char ch = '\0';
        int iCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            ch = Arr[i];
            
            if((ch == A) || ((char)(ch - 32) == A) || ((char)(ch + 32) == A))
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class question52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        char Arr[] = {'b','N','a','D','A'};

        int iRet = aobj.Search(Arr,'a');
        System.out.println(iRet);
    }
}