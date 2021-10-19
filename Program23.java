//accept a number from user & display its in reverse order

import java.lang.*;
import java.util.*;

class Demo
{
    public int iNo,iRev,iDigit;
    public Demo()
    {
        this.iNo=0;
        this.iRev=0;
        this.iDigit=0;
    }
    int ReverseNumber(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
            iNo=iNo/10;
        }
        return iRev;
    }
}
class Program23
{
    public static void main(String arg[])
    {
     int iValue=0,iRet=0;
     System.out.println("Enter number");
     Scanner sobj=new Scanner(System.in);
     iValue=sobj.nextInt();
     Demo dobj=new Demo();
     iRet=dobj.ReverseNumber(iValue);
     System.out.println("Reverse number is:"+iRet);

    }
}