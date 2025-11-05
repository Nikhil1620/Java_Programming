import java.util.Scanner;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is running....");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port no. 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client Request arrives and accepted by the server.");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int No1 = 0;
        int No2 = 0;
        No1 = diobj.readInt();
        No2 = diobj.readInt();

        int iSum = No1 + No2;
        
        doobj.writeInt(iSum);


        sobj.close();
        ssobj.close();
        System.out.println("Server Application terminated.");
    }
}