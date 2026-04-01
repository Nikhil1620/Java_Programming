import java.util.*;

public class program837
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iCube = iNo * iNo * iNo;
        int iCount = 0;
        int iTemp = iNo;
        int iDeno = 0;

        while(iNo != 0)
        {
            iCount = iCount + 1;
            iNo = iNo / 10;
        }

        iDeno = (int)Math.pow(10,iCount);

        if(iCube % iDeno == iTemp)
        {
            System.out.println("Triophic number");
        }
        else
        {
            System.out.println("not triomorphic number");
        }
    }
}