import java.util.*;

public class program832
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        iNo++;

        int Ans = (int)Math.sqrt(iNo);

        if(iNo == (Ans * Ans))
        {
            System.out.println("Sunny number");
        }
        else
        {
            System.out.println("Not a Sunny number");
        }
    }
}