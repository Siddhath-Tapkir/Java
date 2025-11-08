
class CheckString
{
    public String RemoveChar(String str, char ch)
    {
        str = str.trim();
        String Tocken[] = str.split(Character.toString(ch));
        str = str.join("",Tocken);

        return str;
    }
}
class question58
{
    public static void main(String A[])
    {
        CheckString cobj = new CheckString();
        String sRet = null;
        sRet = cobj.RemoveChar("IndiaisDemoIndia",'i');
        System.out.println(sRet);
    }
}