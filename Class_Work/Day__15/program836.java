import java.util.*;

public class program832
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int temp = iNo;
        int iCount = 0;
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {       
            iCount++;
            iNo = iNo / 10;
        }

        iNo = temp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + ((int)Math.pow(iDigit,iCount));
            iCount--;
            iNo = iNo / 10;
        }

        if(iSum == temp)
        {
            System.out.println("Disarium number");
        }
        else
        {
            System.out.println("Not a Disarium number");
        }
    }
}