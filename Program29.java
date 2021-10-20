//Accept a number from user & return the difference between largest & smallest digit.

import java.lang.*;
import java.util.*;

class Diff
{
    public int iNo,iDigit,iMin,iMax;
    public Diff()
    {
        this.iDigit=0;
        this.iMax=0;
        this.iMin=9;
        this.iNo=0;
    }
    int Difference(int iNo)
    {
      if(iNo<0)
      {
          iNo=-iNo;
      }
      while(iNo>0)
      {
          iDigit=iNo%10;
          if(iDigit>iMax)
          {
              iMax=iDigit;
          }
          if(iDigit<iMin)
          {
              iMin=iDigit;
          }
          iNo=iNo/10;

         }
         return iMax-iMin;
    }
}
class Program29
{
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Diff dobj=new Diff();
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.Difference(iValue);
        System.out.println("Difference between largest & smallest digit is:"+iRet);

    }
}