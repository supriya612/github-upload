//Accept a number from user & display number line till that number.
import java.lang.*;
import java.util.*;

class Display
{
    public int iNo,iCnt;
    public Display()
    {
        this.iCnt=0;
        this.iNo=0;
    }
    void NumberLine(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=-iNo;iCnt<=iNo;iCnt++)
        {
            System.out.print(iCnt);
        }

    }
}

class Program30
{
    public static void main(String arg[])
{
    int iValue=0;
    Display dobj=new Display();
    System.out.println("Enter number");
    Scanner sobj=new Scanner(System.in);
    iValue=sobj.nextInt();
    dobj.NumberLine(iValue);
}
}