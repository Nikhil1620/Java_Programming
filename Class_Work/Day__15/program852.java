import java.util.*;

class program852
{
    public static void main(String A[])
    {
        /*Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");*/

        String str = "  india   is   my  country ";
         System.out.println(str);

        str = str.trim();

        str = str.replaceAll("\\s+"," ");  

        System.out.println(str.length()); 

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}