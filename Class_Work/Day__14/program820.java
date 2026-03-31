import java.util.*;

public class program820
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iCount = 0;
        int iDigit = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        System.out.println("The numner of digits are "+iCount);
    }
}