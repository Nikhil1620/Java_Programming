import java.util.*;

public class program823
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
        int iCountTemp = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        //Count numner of digits
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        iCountTemp = iCount;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iPow = 1;
                while(iCount != 0)
                {
                    iPow = iPow * iDigit;
                    iCount--;
                }
            iCount = iCountTemp;
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