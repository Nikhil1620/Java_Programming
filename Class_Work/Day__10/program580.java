import java.util.*;
import java.io.*;

class program580
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter thr name of folder : ");

        String Foldername = sobj.nextLine();

        File fobj = new File(Foldername);   

        if(fobj.exists())
        {
            System.out.println("Folder is present.");
        }
        else
        {
            System.out.println("There is no such folder.");
        }

    }
}