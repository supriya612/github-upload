//Array in java

import java.util.*;

class Array
{
    public int arr[];
   public Array(int iSize)
   {
    arr=new int[iSize];
   }
   public void Accept()
   {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter the elements:");
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=sobj.nextInt();
    
   }
   }
   public int Addition()
   {
    int iSum=0;
    for(int i=0;i<arr.length;i++)
    {
        iSum=iSum+arr[i];
    }
    return iSum;
   }
    public int Multiplication()
   {
    int iMul=1;
    for(int i=0;i<arr.length;i++)
    {
        iMul=iMul*arr[i];
    }
    return iMul;
   }
}

class ArrayOOP
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int iSize=sobj.nextInt();
        Array obj=new Array(iSize);
        obj.Accept();
        int iRet=obj.Addition();
        System.out.println("Addition of all elements in array is:"+iRet);
        iRet=obj.Multiplication();
        System.out.println("Multiplication of all elements in array is:"+iRet);

    }
}