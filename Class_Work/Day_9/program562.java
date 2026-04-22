// Import Packeges

import java.util.*;
import java.io.*;

class program562
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        
        System.out.println("Enter the name of file : ");

        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);

        fwobj.write("Jay Ganesh...");
        
        fwobj.close();
        sobj.close();

    }
}
