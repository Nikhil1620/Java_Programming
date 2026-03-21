
import java.util.Scanner;

class program633
{
    public static void main(String A[])
    {
        
        int iNo = 1;
        int iPos = 0;
        int iMask = 0x1;
        int iResult = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println(iPos+"th Bit is on.");
        }
        else
        {
            System.out.println(iPos+"th Bit is off.");
        }
    }
}
