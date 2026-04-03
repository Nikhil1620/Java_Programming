import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.io.*;

class program893
{
    public static void main(String A[])
    {
        String FileName = "Marvellous.Csv";

       try(FileWriter fwobj = new FileWriter(FileName))
       {
            fwobj.write("name,marks\n");
            fwobj.write("Sagar,90\n");
            fwobj.write("Amit,80\n");
            fwobj.write("Pooja,97\n");
       }
       catch(Exception eobj)
       {
            System.out.println("Exception Occured");
       }

        
    }   
}