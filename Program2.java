//Buffered reader 

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Program2
{
    public static void main(String arg[])
    
        throws IOException
        {
            BufferedReader bobj=new BufferedReader (new InputStreamReader(System.in));
            String name=bobj.readLine();
            System.out.println(name);
        
    }
}