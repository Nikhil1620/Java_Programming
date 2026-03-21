
import java.util.Scanner;

class program624
{
    public static void main(String A[])
    {
        
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 

        int iMask = 4;

        int iResult = 0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("Third bit is on.");
        }
        else
        {
            System.out.println("Third bit is off.");
        }
    }
}
