import java.util.*;

class program492
{
    public static void main(String A[])
    {
        String str = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        str = sobj.nextLine();
        
        int aCount = 0, bCount = 0, cCount = 0;

        char Arr[] = str.toCharArray();
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 'a')
            {
                aCount++;
            }
            else if(Arr[iCnt] == 'b')
            {
                bCount++;
            }
            else if(Arr[iCnt] == 'c')
            {
                cCount++;
            }
        }
        System.out.println("Frequency of a is : "+aCount);
        System.out.println("Frequency of b is : "+bCount);
        System.out.println("Frequency of c is : "+cCount);
    }
}