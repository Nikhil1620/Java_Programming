import java.util.*;

public class program827
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iCount = 0;
        int iDigit = 0;
        int iSum = 0;
        int iTemp = 0;
        int iPow = 1;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        iCount = Integer.toString(iNo).length();
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iPow = (int)Math.pow(iDigit,iCount);

            iSum = iSum + iPow;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}