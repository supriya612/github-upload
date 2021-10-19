import java.util.*;
import java.lang.*;
class Display
{
    public int iNo;
    Display()
    {
        iNo=0;
    }    
    int DisplaySum(int iNo)
    {
        int iSum=0;
        if(iNo==0)
        {
            return 0;
        }
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            iSum=iSum+iCnt;
        }
        return iSum;
    }
}
class Program4
{
    public static void main(String arg[])
    {
        Display dobj=new Display();
        int iValue=0;
        int iRet=0;
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        iRet=dobj.DisplaySum(iValue);
        System.out.println("Addition of numbers is"+iRet);

    }
}