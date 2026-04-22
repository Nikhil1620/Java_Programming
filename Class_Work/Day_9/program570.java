// Import Packeges

import java.util.*;
import java.io.*;

class program570
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        
        
        System.out.println("Enter the name of file : ");

        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            byte Arr[] = str.getBytes();

            System.out.println("Length of Arr is : "+Arr.length);

            foobj.write(Arr);     
        }
        else
        {
            System.out.println("There is no such file.");
        }
        
        sobj.close();

    }
}
