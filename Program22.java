//accept a number from user & return the frequency of entered digit
import java.lang.*;
import java.util.*;

class Display
{
    public int iNo1;
    public int iNo2;
    Display()
    {
        this.iNo1=0;
        this.iNo2=0;
    }
    int Frequency(int iNo1,int iNo2)
    {
        int iDigit=0,iCnt=0;
        if(iNo1<0)
        {
            iNo1=-iNo1;
        }
        if((iNo2<0)||(iNo2>9))
        {
            System.out.println("Invalid Digit");
            return 1;
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
class Program22
{
    public static void main(String arg[])
    {
      int iValue1=0,iValue2=0,iRet=0;
      Display dobj=new Display();
      System.out.println("enter number");
      Scanner sobj=new Scanner(System.in);
      iValue1=sobj.nextInt();
      System.out.println("Enter the digit that you eant to search");
      iValue2=sobj.nextInt();
      iRet=dobj.Frequency(iValue1,iValue2);
      System.out.println("The frequency of ginem digit is :"+iRet);
    }

}