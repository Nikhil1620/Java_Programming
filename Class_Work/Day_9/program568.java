import java.util.*;
import java.io.*;

class program568
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
            System.out.println("File Name : "+fobj.getName());
            System.out.println("File Path : "+fobj.getAbsolutePath());
            System.out.println("File Size : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file.");
        }
        
        sobj.close();

    }
}