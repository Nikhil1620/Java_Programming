import java.util.*;
import java.io.*;

class program581
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter thr name of folder : ");

        String Foldername = sobj.nextLine();

        File fobj = new File(Foldername);   

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present.");
        }
        else
        {
            System.out.println("There is no such folder.");
        }

    }
}