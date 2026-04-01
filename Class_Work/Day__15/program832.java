import java.util.*;

public class program832
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iSquare = iNo * iNo;
        int iCount = 0;
        int iTemp = iNo;
        int iDeno = 0;

        while(iNo != 0)
        {
            iCount = iCount + 1;
            iNo = iNo / 10;
        }

        iDeno = (int)Math.pow(10,iCount);

        if(iSquare % iDeno == iTemp)
        {
            System.out.println("Automorphic number");
        }
        else
        {
            System.out.println("not Automorphic number");
        }
    }
}