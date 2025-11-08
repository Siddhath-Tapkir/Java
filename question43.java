import java.io.*;
class MyArray
{
    public int[] CopyOneArrayRev(int Arr[])
    {
        int Brr[] = new int[Arr.length];

        for(int i = Arr.length - 1, j = 0; i >= 0; i--,j++)
        {
            Brr[j] = Arr[i];
        }
        return Brr;
    }
}
class question43
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of first array");
        int iSize1 = Integer.parseInt(bobj.readLine());

        int Arr[] = new int[iSize1];

        System.out.println("Enter elements of first array");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = Integer.parseInt(bobj.readLine());
        }

        MyArray aobj = new MyArray();

        int Brr[] = aobj.CopyOneArrayRev(Arr);

        for(int i = 0; i < Brr.length; i++)
        {
            System.out.print(Brr[i]+"\t");
        }
        System.out.println();
    }
}