import java.util.*;
import java.lang.*;
class CheckDiv
{
    public int iNo;
    CheckDiv()
    {
        iNo=0;
    }
    void CheckDivisible(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        if(iNo==0)
        {
            return;
        }
        if(((iNo%3)==0)&&((iNo%5)==0))
        {
            System.out.println("Number is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 &5");
        }
    }
}
class Program6
{
    public static void main(String arg[])
    {
        CheckDiv cobj=new CheckDiv();
        int iValue=0;
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        cobj.CheckDivisible(iValue);
    }
}