//Accept a number from user & display addition of its factors

import java.lang.*;
import java.util.*;
class Demo
{
    public int iNo=0;
    Demo()
    {
        this.iNo=0;
    }
    int FactorsSum(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iSum=0;
        for(int iCnt=1;iCnt<=iNo/2;iCnt++)
        {
           
            if((iNo%iCnt)==0)
            {
                iSum=iSum+iCnt;
            }
        }
        return iSum;
    }
}
class Program14
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        int iValue=0,iRet=0;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.FactorsSum(iValue);
        System.out.println("Addition of factors is:"+iRet);
    }
}
