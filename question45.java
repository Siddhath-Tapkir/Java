import java.util.Scanner;
class MyArray
{
    public boolean ChkPallindromeArray(int Arr[])
    {
        boolean bFlag = true;

        int j = Arr.length - 1, i = 0;
        int iTemp = 0, iPalin = 0;

        while(i <= j)
        {
            if(Arr[i] == Arr[j])
            {
                iPalin = 0;
                iTemp = Arr[i];
                while(iTemp != 0)
                {
                    iPalin = (iPalin * 10) + (iTemp % 10);
                    iTemp = iTemp / 10;
                }
                if(iPalin != Arr[i])
                {
                    bFlag = false;
                    break;
                }
            }
            else
            {
                bFlag = false;
                break;
            }
            i++;
            j--;
        }
        return bFlag;
    }
}
class question45
{
    public static void main(String A[])
    {
        MyArray aobj = new MyArray();
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,252,22,12,252,11};

        boolean bRet = aobj.ChkPallindromeArray(Arr);

        System.out.println(bRet);
    }
}