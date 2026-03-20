import java.util.*;
import java.io.*;

class program588
{
    public static void main(String A[])
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        byte key = 0x11;

        System.out.println("Original Data is :"+str);

        //Encryption process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i]^key);
        }

        String output = new String(Arr);

        System.out.println("Encrypted Data : "+output);

        //Decryption process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i]^key);
        }

        String out = new String(Arr);

        System.out.println("Decrypted Data : "+out);

    }
}