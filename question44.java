import java.io.*;
class MyArray
{
    public int[] CopyTwoArrayRev(int Arr[],int Crr[])
    {
        int Brr[] = new int[Arr.length + Crr.length];
        int j = 0;

        for(int i = Arr.length - 1; i >= 0; i--,j++)
        {
            Brr[j] = Arr[i];
        }

        for(int i = Crr.length - 1; i >= 0; i--,j++)
        {
            Brr[j] = Crr[i];
        }

        return Brr;
    }
}
class question44
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

        int Crr[] = aobj.CopyTwoArrayRev(Arr,Brr);

        for(int i = 0; i < Crr.length; i++)
        {
            System.out.print(Crr[i]+"\t");
        }
        System.out.println();
    }
}