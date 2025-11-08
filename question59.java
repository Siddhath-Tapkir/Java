import java.util.*;

class CheckString
{
    public boolean Checkparenthesis(String exp)
    {
        HashMap<Character,Integer> hobj = new HashMap<>();

        char Arr[] = exp.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == '(' || Arr[iCnt] == ')')
            {
                char ch = Arr[iCnt];
                iCount = 1;
                if(hobj.containsKey(ch))
                {
                    iCount = hobj.get(ch);
                    hobj.put(ch,(iCount + 1));
                }
                else
                {
                    hobj.put(ch,iCount);
                }
            }
        }

        int OpenCount = hobj.getOrDefault('(',0);
        int CloseCount = hobj.getOrDefault(')',0);

        return (OpenCount == CloseCount);
    }
}
class question59
{
    public static void main(String A[])
    {
        CheckString cobj = new CheckString();

        System.out.println(cobj.Checkparenthesis("(a+(f-g)*2(a-d))"));
    }
}