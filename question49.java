import java.util.Scanner;
class MyArray
{
    public void Percentage(float Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 70)
            {
                System.out.println(Arr[i]+" : First Class with distingtion");
            }
            else if(Arr[i] >= 60)
            {
                System.out.println(Arr[i]+" : First Class");
            }
            else if(Arr[i] < 60 && Arr[i] > 50)
            {
                System.out.println(Arr[i]+" : Second Class");
            }
            else if(Arr[i] < 50 && Arr[i] > 35)
            {
                System.out.println(Arr[i]+" : Pass Class");
            }
            else if(Arr[i] < 35)
            {
                System.out.println(Arr[i]+" : Fail");
            }
        }
    }
}
class question49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        MyArray aobj = new MyArray();

        float Arr[] = {67.3f,45.8f,88.9f,77.5f,55.2f};

        aobj.Percentage(Arr);
    }
}