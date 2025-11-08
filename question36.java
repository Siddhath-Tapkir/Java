import java.io.*;
class ArrayX
{
    public void Display(int Arr[], int Brr[])
    {
        System.out.println("elements of first array");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }

        System.out.println("\nelements of second array");

        for(int i = 0; i < Brr.length; i++)
        {
            System.out.print(Brr[i]+"\t");
        }
        System.out.println();
    }
}
class question36
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
        ArrayX aobj = new ArrayX();

        aobj.Display(Arr,Brr);
    }
}