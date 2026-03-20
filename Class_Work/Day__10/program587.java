import java.util.*;
import java.io.*;

class program587
{
    public static void main(String A[])
    {
        String str = "Hello";

        byte Arr[] = 

        byte key = 0x11;

        System.out.println("Original Data is :"+str);

        for(int i = 0; i < Arr.Length; i++)
        {
            Arr[i] = (byte)(Arr[i]^key);
        }

        String output = new String(Arr);

        System.out.println("Encrypted Data : "+output);

    }
}