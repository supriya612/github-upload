//Accept a number from user & return its largst digit
import java.util.*;
import java.lang.*;

class Display
{
    public int iNo,iDigit,iMax;
    Display()
    {
        this.iNo=0;
        this.iDigit=0;
        this.iMax=0;
    }
    int MaxDigit(int iNo)
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
            iNo=iNo/10;
        }
        return iMax;
    }
}
class Program25
{
    public static void main(String arg[])
    {
      int iValue=0,iRet=0;
      Display dobj=new Display();
      System.out.println("Enter number");
      Scanner sobj=new Scanner(System.in);
      iValue=sobj.nextInt();
      iRet=dobj.MaxDigit(iValue);
      System.out.println("Max digit is:"+iRet);
    }
}