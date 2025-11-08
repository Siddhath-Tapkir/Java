class EquillibriumIndex
{
    int equillibrium(int Arr[], int iSize)
    {
        int iStart = 0;
        int iEnd = iSize - 1;

        int iSum1 = 0, iSum2 = 0;

        while(iStart <= (iEnd / 2))
        {
            iSum1 += Arr[iStart];
            iSum2 += Arr[iEnd];
            iStart++;
            iEnd--;
            
        }
        
        if(iSum1 == iSum2)
        {
            return iStart;
        }
        else
        {
            return -1;
        }
    }
}

class question62
{
    public static void main(String A[])
    {
        int Arr[] = {-7,1,5,2,-4,3,0};
        int iSize = Arr.length;

        EquillibriumIndex eobj = new EquillibriumIndex();

        int iRet = eobj.equillibrium(Arr,iSize);

        System.out.println(iRet);
    }
}