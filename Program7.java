import java.lang.*;
import java.util.*;

class Display
{
    public int iNo1,iNo2;
    Display()
    {
        iNo1=0;
        iNo2=0;
    }
    void CheckDivision(int iNo1,int iNo2)
    {
        if((iNo1==0)&&(iNo2)==0)
        {
            return ;
        }
        if((iNo1<0)&&(iNo2<0))
        {
            iNo1=-iNo1;
            iNo2=-iNo2;
        }
        if((iNo1%iNo2)==0)
        {
            System.out.println( "First number is divided by second number");
        }
        else
        {
            System.out.println("first is not divided by second number");
        }
    }
}
class Program7
{
    public static void main(String arg[])
    {
        Display dobj=new Display();
        int iValue1=0,iValue2=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        iValue1=sobj.nextInt();
        iValue2=sobj.nextInt();
        dobj.CheckDivision(iValue1, iValue2);
    }
}