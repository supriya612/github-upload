//Final Characteristics in JAVA

import java.util.*;

class Demo
{
    public int i;
    public final int j;
    public Demo()
    {
        j=20;
        i=11;
    }
}


class FinalChar
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        dobj.i++;
        System.out.println("Value of i:"+dobj.i);
        System.out.println("Value of j:"+dobj.j);
       // dobj.j++;       //Not Allowed declared final
    }
}