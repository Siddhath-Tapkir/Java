import java.util.*;

class program506
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string");
        String str = sobj.nextLine();

        str = str.replaceAll(" ","");
        
        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        char Arr[] = str.toCharArray();
        int iFrequency = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch)) // Character is already there in hashmap
            {
                iFrequency = hobj.get(ch);
                hobj.put(ch,iFrequency + 1);
            }
            else // character occured first time
            {
                hobj.put(ch,1);
            }
        }
        for(char ch : hobj.keySet())
        {
            System.out.println("frequency of "+ch+" is : "+hobj.get(ch));
        }
    }
}