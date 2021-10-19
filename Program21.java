//Accept a number from user & display multiplication of digits

import java.lang.*;
import java.util.*;

class Demo
{
    public int iNo;
    Demo()
    {
        this.iNo=0;

    }
    int MultDigits(int iNo)
    {
        int iDigit=0,iMult=1;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        if(iNo==0)
        {
            return 1;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            if(iDigit!=0)
            {
                iMult=iMult*iDigit;
            }
            iNo=iNo/10;
        }
        return iMult;
    }
}
class Program21
{
    public static void main(String arg[])
    {
       int iValue=0,iRet=0;
       System.out.println("enter number");
       Scanner sobj=new Scanner(System.in);
       Demo dobj=new Demo();
       iValue=sobj.nextInt();
       iRet=dobj.MultDigits(iValue);
       System.out.println("Multiplication of digits is:"+iRet);
    }
}
