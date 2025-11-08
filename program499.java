import java.util.*;

/*
    Convert str1 as char array as Arr
    Convert str2 as char array as Brr

    Create Array Count1 of size 26 for Arr
    Create Array Count2 of size 26 for Brr

    Travel Arr and maintain the frequency in Count1
    Travel Brr and maintain the frequency in Count2

    Compare Count1 & Count2
    If they are equal return true
    else return false
*/
class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();
        int Count1[] = new int[26];
        int Count2[] = new int[26];
        boolean bFlag = true;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Count1[Arr[iCnt] - 'a']++;
            }
        }
        for(int iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] >= 'a') && (Brr[iCnt] <= 'z'))
            {
                Count2[Brr[iCnt] - 'a']++;
            }
        }
        for(int iCnt = 0; iCnt < 26; iCnt++)
        {
            if(Count1[iCnt] != Count2[iCnt])
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}
class program499
{
    public static void main(String A[])
    {
        String str1 = null, str2 = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string");
        str1 = sobj.nextLine();

        System.out.println("Enter the second string");
        str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = Marvellous.CheckAnagram(str1,str2);

        if(true == bRet)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}