import java.io.*;
class MyArray
{
    public void MinArray(int Arr[], int Brr[])
    {
        int iMin = 0;

        iMin = Arr[0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(iMin > Arr[i])
            {
                iMin = Arr[i];
            }
        }

        System.out.println(iMin);
        iMin = Brr[0];

        for(int i = 0; i < Brr.length; i++)
        {
            if(iMin > Brr[i])
            {
                iMin = Brr[i];
            }
        }
        
        System.out.println(iMin);
    }
}
class question42
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

        aobj.MinArray(Arr,Brr);
    }
}