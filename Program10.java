//Accept a number from user & return its factorial
import java.lang.*;
import java.util.*;

class Factorial
{
    public int iNo;
    Factorial()
    {
        iNo=0;
    }
    int Fact(int iNo)
    {
        int iMult=1,iCnt=0;
        
        for(iCnt=1;iCnt<<=iNo/2;iCnt++)
        {
            iMult=iMult*iCnt;
            System.out.println(+iMult);
        }
        return iMult;
    }
}
class Program10
{
    public static void main(String arg[])
    {
        Factorial fobj=new Factorial();
        int iValue=0,iRet=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        iValue=sobj.nextInt();
        iRet=fobj.Fact(iValue);
        System.out.println("Factorial is: "+iRet);

    }
}