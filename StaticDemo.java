///Static in java

import java.util.*;

class Demo
{
    public int i=10;
    public static int j=20;

    public void fun()
    {
        System.out.println("Inside nonstatic fun");
        System.out.println(i);
        System.out.println(j);
    }
    public static void gun()
    {
        System.out.println("Inside static gun");
       // System.out.println(i); ////NA
        System.out.println(j);
    }
}
  //static int Demo::j=20;
class StaticDemo
{
    public static void main(String arg[])
    {
     System.out.println("Value of static j:"+Demo.j);
     Demo.gun();    //Demo::gun();
     Demo dobj=new Demo();
     dobj.fun();
     dobj.gun();

     System.out.println("Value of nonstatic i:"+dobj.i);
     System.out.println("Value of static j;"+dobj.j);
    }
}