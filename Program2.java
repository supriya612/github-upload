import java.lang.*;
import java.util.*;
class Demo
{
    public int iNo1,iNo2;
    public Demo()
    {
        iNo1=0;
        iNo2=0;
    }
    int Maximum(int iNo1,int iNo2)
    {
        if(iNo1>iNo2)
        
        {
            return iNo1;
        }
        else{
            return iNo2;
        }
    }
}
class Program2
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter First number");
        int iValue1,iValue2,iRet;
        iValue1=sobj.nextInt();
        System.out.println("enter second number");
        iValue2=sobj.nextInt();
        iRet=dobj.Maximum(iValue1,iValue2);
        System.out.println("Maximum number is"+iRet);
    }
}