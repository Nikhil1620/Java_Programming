import java.util.*;

public class program817
{
    public static boolean CheckStrong(int iNo)
    {
        int i = 0;
        int iFact = 1;
        int iTemp = iNo;
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            for(iFact = 1, i = 1; i <= iDigit; i++)
            {
                iFact = iFact * i;
            }

            iSum = iSum + iFact;
            iNo = iNo / 10;
        }

        if(iTemp == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        boolean bRet = false;

        bRet = CheckStrong(iNo);

        if(bRet == true)
        {
            System.out.println("Strong Number");  
        }
        else
        {
            System.out.println("Not strong number");
        }

        sobj.close();
    }
}