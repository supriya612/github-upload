//Accept a number from user & return the frequency of given digit.

import java.lang.*;
import java.util.*;

class FrequencyX
{
    public int iDigit,iCnt,iNo1,iNo2;

    public FrequencyX()
    {
        this.iNo1=0;
        this.iCnt=0;
        this.iDigit=0;
        this.iNo2=0;
    }
    int FreqDigit(int iNo1,int iNo2)
    {
        if(iNo1<0)
        {
            iNo1=-iNo1;
        }
        while(iNo1>0)
        {
            iDigit=iNo1%10;
            if(iDigit==iNo2)
            {
                iCnt++;
            }
            iNo1=iNo1/10;
        }
        return iCnt;
    }
}
class Program27
{
    public static void main(String arg[])
    {
        int iValue1=0,iValue2=0,iRet=0;
        FrequencyX fobj=new FrequencyX();
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue1=sobj.nextInt();
        System.out.println("Enter the digit that you want to count");
        iValue2=sobj.nextInt();
        iRet=fobj.FreqDigit(iValue1,iValue2);
        System.out.println("Frequency of digit is:"+iRet);
    }
}