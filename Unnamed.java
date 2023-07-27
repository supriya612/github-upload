//Unnamed block in JAVA

import java.util.*;
 
 class Demo
 {
    public int i,j;
    public static int x,y;
    //Unnamed block
    {
        System.out.println("inside unnamed  block");
        i=10;
        j=20;
    }
    public Demo()
    {
        System.out.println("Inside default constructor");
    }
    public Demo(int a, int b)
    {
        System.out.println("Inside parameterized constructor");
    }
    static
    {
        System.out.println("Inside static block");
        x=10;
        y=20;
    }
 }

class Unnamed
{
    public static void main(String arg[])
    {
        Demo dobj1=new Demo();
        Demo dobj2=new Demo(11,21);
    }
}
