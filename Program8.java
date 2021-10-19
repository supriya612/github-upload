import java.lang.*;
import java.util.*;

class Table
{
    public int iNo;
    Table()
    {
        iNo=0;

    }
    void  DisplayTable(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=0;iCnt<=10;iCnt++)
        {
            System.out.println(+iNo*iCnt);
        }
    }
}
class Program8
{
    public static void main(String arg[])
    {
        Table tobj=new Table();
        int iValue=0;
        System.out.println("enter number");
        Scanner sobj=new Scanner(System.in);
        iValue=sobj.nextInt();
        tobj.DisplayTable(iValue);
        
    }
}