//Interface in JAVA

import java.util.*;

interface Circle
{
    float PI=3.14f;    //public, static, final
    float area(float radius);   //public abstract
    float circumference(float radius);

}
class Marvellous implements Circle
{
    public float area(float radius)
    {
        float ret=0.0f;
        ret=PI*radius*radius;
        return ret;
    }

    public float circumference(float radius)
    {
        float ret=0.0f;
        ret=2*PI*radius;
        return ret;
    }
}

class InterfaceDemo
{
    public static void main(String arg[])
    {
     Scanner sobj=new Scanner(System.in);
     System.out.println("Enter radius");
     float value=sobj.nextFloat();
     Marvellous mobj=new Marvellous();
     float fret=0.0f;
     fret=mobj.area(value);
     System.out.println("Area is:"+fret);
     fret=mobj.circumference(value);
     System.out.println("circumference is:"+fret);
     System.out.println("Value of PI is:"+Circle.PI);   //static by default so can access by class name
     //Circle.PI=6.14f;     //by default final so not allowed
    }
}