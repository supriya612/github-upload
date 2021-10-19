import java.util.*;
import java.lang.*;
class Demo
{
    public int iNo;
    Demo()
    {
        iNo=0;
    }
    void DisplayNumbers(int iNo)
    {
        int i=0;
        if(iNo==0)
        {
            return;
        }
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(i=1;i<=iNo;i++)
        {
            System.out.println(+i);
        }
    }
}
class Program3
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        int iValue=0;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        dobj.DisplayNumbers(iValue);
    }
}