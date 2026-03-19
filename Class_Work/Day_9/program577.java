import java.util.*;
import java.io.*;

class program577
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        File fobjsrc = null;
        File fobjdest = null;

        String str = null;

        byte Buffer[] = new byte[1024];

        boolean bRet = false;

        String FileNameSrc = null;
        String FileNameDest = null;

        Scanner sobj = new Scanner(System.in);
        
        
        System.out.println("Enter the name of Source file : ");

        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of Destination file : ");

        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();
            
            FileInputStream fiobj = new FileInputStream(fobjsrc);

            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                // System.out.print(str);
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File Copy successful.");
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file.");
        }
        
        sobj.close();

    }
}