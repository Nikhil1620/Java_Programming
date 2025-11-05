import java.util.Scanner;
import java.io.*;
import java.net.*;

class AdditionClient3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running....");


        Socket sobj = new Socket("Localhost", 2100);
        System.out.println("Server Successfully Connected.");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int No1 = 11;
        int No2 = 10;
        doobj.writeInt(No1);
        doobj.writeInt(No2);



        int iSum = diobj.readInt();
        System.out.println("Additon is "+iSum);

        sobj.close();

        System.out.println("Client Application terminated.");
    }
}