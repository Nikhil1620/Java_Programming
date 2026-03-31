import java.util.*;

public class program828
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        int iDigit = 0;
        int iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
        {
            System.out.println("Harshad number");
        }
        else
        {
            System.out.println("Not a harshad number");
        }
        
    }
}