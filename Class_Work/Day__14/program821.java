import java.util.*;

public class program821
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

        for(iPow = 1, i = 1; i <= y; i++)
        {
            iPow = iPow * i;
        }

        System.out.println(iPow);

    }
}