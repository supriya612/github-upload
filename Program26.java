//Accept a number from user & return smallest digit.

import java.util.*;
import java.lang.*;

class Demo
{
    public int iDigit,iMin;
    Demo()
    {
        this.iDigit=0;
        this.iMin=9;

    }
    int MinDigit(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            if(iDigit<iMin)
            {
                iMin=iDigit;
            }
            iNo=iNo/10;

        }
        return iMin;
    }
}
class Program26
{
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Demo dobj=new Demo();
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.MinDigit(iValue);
        System.out.println("Smalllest digit is:"+iRet);
    }
}