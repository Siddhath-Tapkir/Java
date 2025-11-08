import java.util.Scanner;
class MyArray
{
    public void SumArray(int Arr[])
    {
        int iSum = 0, iDigit = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iSum = 0;
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iSum = iDigit + iSum;
                Arr[i] = Arr[i] / 10;
            }
            Arr[i] = iSum;
        }
    }
}
class question47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        int Arr[] = {89,687,56,549,87,9};
        aobj.SumArray(Arr);

        for(int i : Arr)
        {
            System.out.println(i+"\t");
        }
    }
}