
import java.util.Scanner;

class program630
{
    public static void main(String A[])
    {
        
        int iNo = 0;
        int iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 
        
        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        int iMask = 0x02000000;

        int iResult = 0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("26th bit is on.");
        }
        else
        {
            System.out.println("26th bit is off.");
        }
    }
}
