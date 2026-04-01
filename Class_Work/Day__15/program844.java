import java.util.*;

class program844
{
    public static void main(String A[])
    {
        /*Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");*/

        String str = "    hello worlld    ";
        System.out.println(str);

        str = str.trim();

        str = str.replaceAll("ll","LL");

        System.out.println(str.length()); //Will count Space

        System.out.println(str);

    }
}