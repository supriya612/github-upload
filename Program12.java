//Accept a number from user & display factors of that number

import java.lang.*;
import java.util.*;

class DisplayFactors
{
    public int iNo;
    DisplayFactors()
    {
        iNo=0;
    }
    void Factors(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=1;iCnt<iNo;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(+iCnt);
            }
        }
    }
}
class Program12
{
    public static void main(String arg[])
    {
        DisplayFactors dobj=new DisplayFactors();
        int iValue=0;
        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        dobj.Factors(iValue);
    }
}