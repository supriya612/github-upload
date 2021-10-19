//accept a number from user & display sum of its digits
 
import java.lang.*;
import java.util.*;

class Display{
    public int iNo;
    public Display()
    {
        this.iNo=0;
    }
    int SumDigits(int iNo)
    {
        int iDigit=0,iSum=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            iNo=iNo/10;
            iSum=iSum+iDigit;
        }
        return iSum;
    }
}
class Program18
{
    public static void main(String args[])
    {
        int iValue=0,iRet=0;
        Display dobj=new Display();
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.SumDigits(iValue);
        System.out.println("Addition of digits are:"+iRet);
    }

}