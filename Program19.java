//accept a number from user & return number of even digits

import java.lang.*;
import java.util.*;

class Demo
{
    public int iNo;
    Demo()
    {
        this.iNo=0;
    }
    int EvenDigits(int iNo)
    {
        int iDigit=0,iCnt=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            iNo=iNo/10;
        }
        return iCnt;
    }

}
class Program19
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        int iValue=0,iRet=0;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.EvenDigits(iValue);
        System.out.println("number of even digits is:"+iRet);

    }
}