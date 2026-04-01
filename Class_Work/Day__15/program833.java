import java.util.*;

public class program832
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iDigit = 0;
        int iMult = 1;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }

        if(iSum == iMult)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not a Spy number");
        }
    }
}