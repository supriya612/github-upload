//Accept a number from user & display its digits saperately

import java.lang.*;
import java.util.*;

class Digits{
    public int iNo;
    public Digits()
    {
        this.iNo=0;
    }
    void DisplayDigits(int iNo)
    {
        int iDigit=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            iDigit=iNo%10;
            System.out.println(+iDigit);
            iNo=iNo/10;
        }
    }
}
class Program17
{
    public static void main(String arg[])
    {
        Digits dobj=new Digits();
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        iValue=sobj.nextInt();
        dobj.DisplayDigits(iValue);
    }
}