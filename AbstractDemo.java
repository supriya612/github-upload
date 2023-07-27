//Abstract classes in JAVA


import java.util.*;

abstract class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Inside constructor of demo");
        i=10;
        j=20;
    }
    public void fun()
    {
        System.out.println("Inside fun of Demo");
    }
    public void gun()
    {
        System.out.println("Inside gun of demo");
    }
    public abstract void sun();
}
class Hello extends Demo{
    public int x,y;
    public Hello()
    {
        System.out.println("Inside constructor of Hello");
        x=10;
        y=20;
    }
    public void fun()
    {
        System.out.println("inside fun of Hello");
    }
    public void sun()
    {
        System.out.println("inside sun of hello");
    }
}
class AbstractDemo
{
    public static void main(String arg[])
    {
    // Demo dobj=new Demo();      //Abstract class so cant create object
    Demo dobj;    //Allowed reference can create
    dobj=new Hello();
    dobj.fun();
    dobj.gun();
    dobj.sun();
    System.out.println(dobj.i);
    System.out.println(dobj.j);
    }
}