//Command line argument

import java.util.*;

class Command
{
    public static void main(String arg[])
    {
        System.out.println("Total number of arguments"+arg.length);

        System.out.println("Command line argument are:");

        for(int i=0;i<arg.length;i++)
        {
            System.out.println(arg[i]);
        }
    }
}