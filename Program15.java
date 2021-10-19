//Accept a number from user & check whether its perfect or not

import java.util.*;
import java.lang.*;

class Perfect
{
    public int iNo;
    public Perfect()
    {
        iNo=0;
    }
    boolean CheckPerfect(int iNo)
    {
        int iSum=0;
        int iCnt=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                iSum=iSum+iCnt;
            }
        }
        if(iSum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
class Program15
{
    public static void main(String arg[])
    {
        Perfect pobj=new Perfect();
        int iValue=0;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        boolean bRet;
        bRet=pobj.CheckPerfect(iValue);
        if(bRet==true)
        {
            System.out.println("number is perfect"+iValue);
        }
        else
        {
            System.out.println("Number is not perfect"+iValue);
        }


    }
}