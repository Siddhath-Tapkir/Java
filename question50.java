import java.util.Scanner;
class MyArray
{
    public void ArrayReplace(char Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
    }
}
class question50
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        char Arr[] = {'b','N','a','D','c'};

        aobj.ArrayReplace(Arr);

        for(char i : Arr)
        {
            System.out.println(i+"\t");
        }
    }
}