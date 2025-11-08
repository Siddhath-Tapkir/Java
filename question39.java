import java.io.*;
class MyArray
{
    public int[] ArrayConcate(int Arr[], int Brr[])
    {
        int Crr[] = new int[(Arr.length + Brr.length)];
        int j = 0;

        for(int i = 0; i < Arr.length; i++,j++)
        {
            Crr[j] = Arr[i];
        }

        for(int i = 0; i < Brr.length; i++,j++)
        {
            Crr[j] = Brr[i];
        }
        
        return Crr;
    }
}
class question39
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

        int Crr[] = aobj.ArrayConcate(Arr,Brr);

        System.out.println("New array contents are:");

        for(int i = 0; i < Crr.length; i++)
        {
            System.out.print(Crr[i]+"\t");
        }
        System.out.println();

    }
}