//Accept a number from user & display factors of it.

import java.lang.*;
import java.util.*;


class Demo{
    public int iNo,iCnt;
    Demo()
    {
        this.iNo=0;
        this.iCnt=0;
    }
    public void Factors(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=iNo/2;iCnt>=1;iCnt--)
        {
            if((iNo%iCnt)==0)
            {
            System.out.println(iCnt);
            }
        }
    }
}
class Program28
{
    public static void main(String arg[])
    {
        int iValue=0;
        Demo dobj=new Demo();
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        dobj.Factors(iValue);
    }
}