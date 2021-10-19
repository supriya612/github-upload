//accept a number from user & check whether its palindrome or not.

import jana.lang.*;
import java.util.*;

class Demo
{
    public int iNo,iDigit,iTemp,iRev;
    Demo()
    {
        this.iNo=0;
        this.iDigit=0;
        this.iRev=0;
        this.iTemp=0;
    }
    boolean CheckPalindrome(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        iTemp=iNo;
        while(iNo>0)
        {
            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
            iNo=iNo/10;
        }
        if(iRev==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program24
{
    public static void main(String arg[])
    {
        int iValue=0;
        boolean bRet;
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        iValue=sobj.nextInt();
        
        bRet=dobj.CheckPalindrome(iValue);
        if(bRet==true)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}