//Final method in JAVA
import java.util.*;

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base gun");
    }
}
class Derived extends Base{

    public void fun()              //Override
    {
     System.out.println("Derived fun");

    }
  /*  public void gun()
    {
        System.out.println("Derived gun");
    }  */
}

class FinalMethod
{
  public static void main(String arg[]);
  Base bobj=new Derived();            //upcasting
  bobj.fun();
  //bobj.gun();
}