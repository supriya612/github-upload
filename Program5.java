//Program to check number is even or odd

import java.util.*;
import java.lang.*;
import java.io.*;


class Program5
{
    public static void main(String arg[])
    {
        int ino1=0;
        boolean bRet=false;

        System.out.println("Enter number");
        Scanner sobj=new Scanner(System.in);
        ino1=sobj.nextInt();
       
   if(((ino1%2)==0))
    {
        System.out.println("Number is Even");
    }
    else
    {
        System.out.println("Number is Odd");
    }

}}