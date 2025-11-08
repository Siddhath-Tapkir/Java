import java.util.Scanner;
class MyArray
{
    public void ArrayReverse(int Arr[])
    {
        int iRev = 0, iDigit = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iRev = 0;
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iRev = (iRev * 10) + iDigit;
                Arr[i] = Arr[i] / 10;
            }
            Arr[i] = iRev;
        }
    }
}
class question46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        int Arr[] = {-89,-687,-56,-549,-87,-9};
        aobj.ArrayReverse(Arr);

        for(int i : Arr)
        {
            System.out.println(i+"\t");
        }
    }
}