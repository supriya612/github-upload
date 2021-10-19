import java.lang.*;
import java.util.*;
class Check
{
    public int iNo;
    Check()
    {
        iNo=0;
    }
    void CheckEven(int iNo)
    {
        if(iNo==0)
        {
            return;
        }
        if(iNo<0)
        {
            iNo=-iNo;
        }
        if((iNo%2)==0)
        {
           System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
class Program5
{
    public static void main(String arg[])
    {
        int iValue=0;
        
        Check cobj=new Check();
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        cobj.CheckEven(iValue);
    }
}
