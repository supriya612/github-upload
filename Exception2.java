//Exception in java

import java.util.*;


class Exception2
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ino1=0,ino2=0;
        float result=0.0f;
        System.out.println("Enter first number");
        ino1=sobj.nextInt();
        System.out.println("Enter second number");
        ino2=sobj.nextInt();

        try
        {
            result=ino1/ino2;
            System.out.println("Division  is"+result);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Arithmetic exception occured");
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array index exception occured");
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("Inside finally");
        }
    }
}