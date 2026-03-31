import java.util.*;

public class program822
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int i = 0;
        int iPow = 0;

        System.out.println("Enter the base : ");
        x = sobj.nextInt();

        System.out.println("Enter the power : ");
        y = sobj.nextInt();

        // x = 5, y = 3
        iPow = 1;
        
        while(y != 0)
        {
            iPow = iPow * x;
            y--;
        }

        System.out.println(iPow);

    }
}