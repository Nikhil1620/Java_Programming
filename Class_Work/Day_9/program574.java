// Import Packeges

import java.util.*;
import java.io.*;

class program574
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        byte Buffer[] = new byte[100];
        boolean bRet = false;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        
        System.out.println("Enter the name of file : ");

        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer));
            }

            System.out.println();
        }
        else
        {
            System.out.println("There is no such file.");
        }
        
        sobj.close();

    }
}
