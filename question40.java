import java.io.*;
class MyArray
{
    public void Summation(int Arr[], int Brr[])
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iSum += Arr[i];
        }
        System.out.println("Summation of first array is "+iSum);

        iSum = 0;

        for(int i = 0; i < Brr.length; i++)
        {
            iSum += Brr[i];
        }

        System.out.println("Summation of second array is "+iSum);        
    }
}
class question40
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of first array");
        int iSize1 = Integer.parseInt(bobj.readLine());

        int Arr[] = new int[iSize1];
        
        System.out.println("Enter size of second array");
        int iSize2 = Integer.parseInt(bobj.readLine());

        int Brr[] = new int[iSize2];

        System.out.println("Enter elements of first array");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = Integer.parseInt(bobj.readLine());
        }

        System.out.println("Enter elements of second array");

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = Integer.parseInt(bobj.readLine());
        }
        MyArray aobj = new MyArray();

        aobj.Summation(Arr,Brr);
    }
}