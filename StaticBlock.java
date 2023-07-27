//Static Block in JAVA

import java.util.*;

class Demo
{
    public int i,j;

    public static int x,y;
    static
    {
        System.out.println("Inside static block");
        x=10;
        y=20;
    }
    public Demo()
    {
        System.out.println("Inside constructor");
        i=10;
        j=20;
    }
   
}

class StaticBlock
{
    static 
    {
        System.out.println("Inside static block of main");

    }
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        //System.out.println(Demo.x);
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();
    }
}
