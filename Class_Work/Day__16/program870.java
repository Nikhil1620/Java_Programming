//India is my country i live in INDIA

//Bharat is my country i live in bharat

import java.util.*;

class program870
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");

        String str = sobj.nextLine();
        
        str = str.trim();
        
        str = str.replaceAll("//s+"," ");

        String Arr[] = str.split(" ");

        StringBuffer FinalStr = new StringBuffer();


        for(int i = 0; i < Arr.length; i++)    
        {
            if(Arr[i].equalsIgnoreCase("india"))
            {
                FinalStr.append("Bharat"+" ");
            }
            else
            {
                FinalStr.append(Arr[i] + " ");
            }
        }

        System.out.println(FinalStr);
        
    }
}