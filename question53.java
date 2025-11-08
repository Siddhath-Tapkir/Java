import java.util.Scanner;
class MyArray
{
    public int Difference(char Arr[])
    {
        int CapCount = 0, SmallCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                CapCount++;
            }
            else if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                SmallCount++;
            }
        }

        return CapCount - SmallCount;
    }
}
class question53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        char Arr[] = {'b','N','a','D','C'};

        int iRet = aobj.Difference(Arr);
        System.out.println(iRet);
    }
}