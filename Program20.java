//accept a number from user & return number of even digits

import java.lang.*;
import java.util.*;

class Display
{
   public int iNo;
   public Display()
   {
       this.iNo=0;
   }
   int EvenDigit(int iNo)
   {
       int iCnt=0;
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
        if(((iNo%10)%2)==0)
        {
            iCnt++;
        }
        iNo=iNo/10;
        }
        return iCnt;
   }
}
class Program20
{
    public static void main(String arg[])
    {
    int iValue=0,iRet=0;
    System.out.println("Enter number");
    Scanner sobj=new Scanner(System.in);
    Display dobj=new Display();
    iValue=sobj.nextInt();
    iRet=dobj.EvenDigit(iValue);
    System.out.println("Number of even digits is:"+iRet);
    }
}