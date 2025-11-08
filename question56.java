import java.util.*;

class CheckString
{
    public void DisplayWordFrequency(String sentence)
    {
        sentence = sentence.trim();
        String Tocken[] = sentence.split("\\s+");

        int iCount = 0;

        HashMap <String,Integer> hobj = new HashMap<>();

        for(int iCnt = 0; iCnt < Tocken.length; iCnt++)
        {
            String Word = Tocken[iCnt];
            iCount = 1;

            if(hobj.containsKey(Word))
            {
                iCount = hobj.get(Tocken[iCnt]);

                hobj.put(Word,(iCount + 1));
            }
            else
            {
                hobj.put(Tocken[iCnt],iCount);
            }
        }

        for(String Word : hobj.keySet())
        {
            System.out.println(Word+" : "+hobj.get(Word));
        }
    }
}
class question56
{
    public static void main(String A[])
    {
        CheckString cobj = new CheckString();

        cobj.DisplayWordFrequency("India is my countr India India");
    }
}