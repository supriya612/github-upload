//Accept N numbers from user & display it on screen.

import java.lang.*;
import java.util.*;

class Array
{
  public int iLength;
   public int ptr[];
   public Array(int no)
   {
       iLength=no;
       ptr=new int[iLength];
   }
  public void Accept()
   {
       int i=0;
       System.out.println("Enter the elements of array");
       Scanner sobj1=new Scanner(System.in);
       for(i=0;i<iLength;i++)
       {
           ptr[i]=sobj1.nextInt();
       }
   }
   public void Display()
   {
       int i=0;
       System.out.println("elements of array are");
       
       for(i=0;i<iLength;i++)
       {
           System.out.println(+ptr[i]);
       }
   }
}

class Program31
{
    public static void main(String arg[])
    {
        int iSize=0;
        System.out.println("Enter the size of array");
        Scanner sobj=new Scanner(System.in);
        iSize=sobj.nextInt();
        Array obj=new Array(iSize);
        obj.Accept();
        obj.Display();
    }
}