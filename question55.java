class CheckString
{
    public boolean RotationString(String str1, String str2)
    {
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        if(Arr.length != Brr.length)
        {
            System.out.println("Lenght are not equal");
        
            return false;
        }
        
        int i = 0, j = 0;
        boolean bFlag = false;

        for(i = 0; i < Arr.length; i++)
        {
            if(new String(Arr).equals(str2))
            {
                bFlag = true;
            }
            char ch = Arr[0];
            for(j = 0; j < Arr.length - 1; j++)
            {
                Arr[j] = Arr[j + 1];
            }
            Arr[Arr.length - 1] = ch;
        }
        return bFlag;
    }
}
class question55
{
    public static void main(String A[])
    {
        CheckString cobj = new CheckString();

        System.out.println(cobj.RotationString("ABCD","CDAB"));
    }
}