import java.util.Scanner;
class MyArray
{
    public void Pattern(int Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i]; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class question54
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        int Arr[] = {8   ,9   ,7   ,6   ,4   ,2   ,4};
        aobj.Pattern(Arr);
    }
}