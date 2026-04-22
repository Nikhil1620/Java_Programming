// Import Packeges

import java.util.*;
import java.io.*;

class program566
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileReader frobj = null;
        
        System.out.println("Enter the name of file : ");

        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);

            System.out.print((char)(frobj.read()));
            System.out.print((char)(frobj.read()));
            System.out.print((char)(frobj.read()));
        }
        else
        {
            System.out.println("There is no such file.");
        }
        
        if(frobj != null)
        {
            frobj.close();
        }
        
        sobj.close();

    }
}
