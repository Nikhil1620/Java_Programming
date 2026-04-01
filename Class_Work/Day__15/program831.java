import java.util.*;

public class program831
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iDigit = 0;
        
        int iAns = iNo * iNo;
        int iTemp = iNo;
        int iSum = 0;

        while(iAns != 0)
        {
            iDigit = iAns % 10;
            iSum = iSum + iDigit;
            iAns = iAns / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a neon number");
        }
    }
}