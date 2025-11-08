import java.util.*;

class CheckString
{
    public void DisplayWord(String sentence)
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

        iCount = 0;
        String Word = null;
        for(String str : hobj.keySet())
        {
            if(iCount < hobj.get(str))
            {
                iCount = hobj.get(str);
                Word = str;
            }
        }
        System.out.println(Word);
    }
}
class question57
{
    public static void main(String A[])
    {
        CheckString cobj = new CheckString();

        cobj.DisplayWord("India is my is is India");
    }
}