import java.util.Scanner;
class MyArray
{
    public int ArrayCapital(char Arr[])
    {
        int iCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }

        return iCount;
    }
}
class question48
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        char Arr[] = {'b','N','a','D','C'};

        int iRet = aobj.ArrayCapital(Arr);
        System.out.println(iRet);
    }
}