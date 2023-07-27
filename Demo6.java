//One interface can extends another interface

import java.util.*;

interface Base{
    void fun();
}
 interface Derived extends Base{
    void gun();
 }

 class Marvellous implements Derived
 {
    public void fun()
    {
        System.out.println("Inside fun");

    }
    public void gun()
    {
        System.out.println("inside gun");
    }
 } 

class Demo6
{
    public static void main(String arg[])
    {
        Marvellous mobj=new Marvellous();
        mobj.fun();
        mobj.gun();
    }
}