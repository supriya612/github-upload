//Multiply two float number

import java.util.*;


class Program3
{
    public static void main(String arg[])
    {
        float ino1=0.0f,ino2=0.0f;
        System.out.println("Enter two float numbers");
        Scanner sobj=new Scanner(System.in);
        ino1=sobj.nextFloat();
        ino2=sobj.nextFloat();
        float fRet=ino1*ino2;
        System.out.println("Multiplication is:"+fRet);
    }
}