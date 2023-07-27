//Exception


import java.util.*;
class Demo
{
    public float Division(int x,int y) throws ArithmeticException
    {
        float ans=0.0f;
        ans=x/y;
        return ans;
    }
}
class Exception3
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0,ino2=0;
        float result=0.0f;
        Demo dobj=new Demo();
        System.out.println("Enter first number");
        ino1=sobj.nextInt();
        System.out.println("Enter second number");
        ino2=sobj.nextInt();
        try{
        result=dobj.Division(ino1,ino2);
        System.out.println("Division is:"+result);
    }
    catch(ArithmeticException obj)
    {
        System.out.println("Exception occurred");
    }
    
    }
}