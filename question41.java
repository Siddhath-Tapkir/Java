import java.io.*;
class MyArray
{
    public int Summation(int Arr[], int Brr[])
    {
        int iSum1 = 0, iSum2 = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iSum1 += Arr[i];
        }

        for(int i = 0; i < Brr.length; i++)
        {
            iSum2 += Brr[i];
        }
        return iSum1 - iSum2;       
    }
}
class question41
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

        System.out.println(aobj.Summation(Arr,Brr));
    }
}