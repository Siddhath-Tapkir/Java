import java.io.*;
class Program
{
    public int iNo1, iNo2, iNo3, iTotal, iAvg;
    public float fPer;
    public Program(int A, int B, int C)
    {
        this.iNo1 = A;
        this.iNo2 = B;
        this.iNo3 = C;
    }
    public void Student()
    {
        iTotal = iNo1 + iNo2 + iNo3;
        iAvg = (iNo1 + iNo2 + iNo3) / 3;
        System.out.println("Total marks are"+iTotal);
        System.out.println("percentage marks are"+iAvg);
        
    }
}
class J1
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter marks for 1st subject");
        try
        {
            iValue1 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException e)
        {}
        System.out.println("Enter marks for 2nd subject");
        try
        {
            iValue2 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException i)
        {}
        System.out.println("Enter marks for 3rd subject");
        try
        {
            iValue3 = Integer.parseInt(bobj.readLine());
        }
        catch(IOException o)
        {}
        Program obj = new Program(iValue1,iValue2,iValue3);
        obj.Student();
       
        
    } 
}