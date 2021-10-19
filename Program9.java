import java.lang.*;
import java.util.*;

class DisplayPower
{
  public int iNo1,iNo2;
  public DisplayPower()
  {
      iNo1=0;
      iNo2=0;
  }
  int Power(int iNo1,int iNo2)
  {
      if((iNo1==0)&&(iNo2==0))
      {
          return 0;
      }
      if((iNo1<0)&&(iNo2<0))
      {
          iNo1=-iNo1;
          iNo2=-iNo2;
      }
      int iMult=1;
      for(int iCnt=1;iCnt<=iNo2;iCnt++)
      {
          iMult=iMult*iNo1;
      }
      return iMult;
  }
}
class Program9
{
    public static void main(String args[])
    {
        DisplayPower dobj=new DisplayPower();
        int iValue1=0,iValue2=0,iRet=0;
        System.out.println("Enter two numbers");
        Scanner sobj=new Scanner(System.in);
        iValue1=sobj.nextInt();
        iValue2=sobj.nextInt();
        iRet=dobj.Power(iValue1,iValue2);
        System.out.println("Result is:"+iRet);
    }
}
