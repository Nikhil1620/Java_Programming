import java.util.*;

public class program816
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        int i = 0;
        int iFact = 1;
        int iTemp = iNo;
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            for(iFact = 1, i = 1; i <= iDigit; i++)  //Imp line (need to reset the iFact)
            {
                iFact = iFact * i;
            }

            iSum = iSum + iFact;
            iNo = iNo / 10;
        }

        if(iTemp == iSum)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not strong number");
        }
    }
}