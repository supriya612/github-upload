//Accept a number from user & check whether its prime or not

import java.lang.*;
import java.util.*;

class Prime 
{
    public int iNo;
    Prime()
    {
        this.iNo=0;
    }    
    boolean CheckPrime(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iCnt=0;
        for(iCnt=2;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                break;
            }
        }
        if(iCnt==(iNo/2)+1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
class Program16
{
    public static void main(String args[])
    {
        Prime pobj=new Prime();
        int iValue=0;
        boolean bRet;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        bRet=pobj.CheckPrime(iValue);
        if(bRet==true)
        {
            System.out.println("Number is prime"+iValue);
        }
        else
        {
            System.out.println("Number is not prime"+iValue);
        }
    }
}