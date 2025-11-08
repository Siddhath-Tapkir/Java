import java.util.*;

class program495
{
    public static void main(String A[])
    {
        String str = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        str = sobj.nextLine();
        
        int Count[] = {0,0,0};

        char Arr[] = str.toCharArray();
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] == 'a')|| (Arr[iCnt] == 'b') || (Arr[iCnt] == 'c'))
            {
                Count[Arr[iCnt] - 'a']++;
            }
        }
        System.out.println("Frequency of a is : "+Count[0]);
        System.out.println("Frequency of b is : "+Count[1]);
        System.out.println("Frequency of c is : "+Count[2]);
    }
}