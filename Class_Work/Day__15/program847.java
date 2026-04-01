import java.util.*;

class program847
{
    public static void main(String A[])
    {
        /*Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");*/

        String str = "  india   is   my  country ";
         System.out.println(str);

        str = str.trim();

        str = str.replaceAll("  "," ");

        System.out.println(str.length()); //Will count Space

        System.out.println(str);

    }
}