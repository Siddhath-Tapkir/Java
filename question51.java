import java.util.Scanner;
class MyArray
{
    public int ArrayCountVowel(char Arr[])
    {
        char ch = '\0';
        int iCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            ch = Arr[i];
            if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class question51
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        char Arr[] = {'b','N','a','D','A'};

        int iRet = aobj.ArrayCountVowel(Arr);
        System.out.println(iRet);
    }
}