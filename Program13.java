//Accept a number from user & display factors of that number

import java.lang.*;
import java.util.*;
class Display
{
    public int iNo;
    Display()
    {
        iNo=0;
    }
    void Factors(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=1;iCnt<<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(+iCnt);
            }
        }
    }
}
class Program13
{
    public static void main(String arg[])
    {
        int iValue=0;
        Display dobj=new Display();
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        dobj.Factors(iValue);
    }
}