

import java.util.*;

import Marvellous.PPA.Mathematics;
import Marvellous.Python.Demo;


class Don
{
    public static void main(String arg[])
    {
        Mathematics mobj =new Mathematics();

        Demo dobj=new Demo();

        int iRet=mobj.Add(10,11);
        System.out.println("Addition is"+iRet);
        dobj.fun();
    }
}