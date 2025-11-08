class MaximumDifference
{
    public int maxDiff(int Arr[])
    {
        int iMin = 0, iDiff = 0;
        boolean bFlag = false;

        iMin = Arr[0];
        iDiff = Arr[1] - Arr[0];

        for(int i = 1; i < Arr.length; i++)
        {
            if((Arr[i] - iMin) > iDiff)
            {
                iDiff = Arr[i] - iMin;
            }

            if(iMin > Arr[i])
            {
                iMin = Arr[i];
                //iDiff = 0;
            }
        }

        return iDiff;
    }
}
class question60
{
    public static void main(String A[])
    {
        MaximumDifference mobj = new MaximumDifference();

        int Arr[] = {7,9,5,6,3,2};
        int iRet = mobj.maxDiff(Arr);

        System.out.println(iRet);
    }
}