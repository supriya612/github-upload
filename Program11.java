//Accept a number from user & return its factorial

import java.lang.*;
import java.util.*;

class FactorialX
{
    public int iNo;
    FactorialX()
    {
        iNo=0;
    }
    int Fact(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iMult=1;
        while(iNo>0)
        {
            iMult=iMult*iNo;
            iNo--;
        }
        return iMult;
    }
}
class Program11
{
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        FactorialX fobj=new FactorialX();
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=fobj.Fact(iValue);
        System.out.println("Factorial is:"+iRet);
    }
}