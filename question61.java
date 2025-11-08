class SagregateOddEven
{
    public void sagregateOddEven(int Arr[])
    {
        int i = 0;
        int j = 0;
        j = Arr.length - 1;
        int temp = 0;

        while(i < j)
        {
            while(Arr[i] % 2 == 0)
            {
                i++;
            }
            while(Arr[j] % 2 != 0)
            {
                j--;
            }
            if(i < j)
            {
                temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        }
    }
}
class question61
{
    public static void main(String A[])
    {
        int Arr[] = {12,34,45,9,8,90,3};

        SagregateOddEven sobj = new SagregateOddEven();

        sobj.sagregateOddEven(Arr);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}