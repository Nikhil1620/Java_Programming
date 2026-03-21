
import java.util.Scanner;

class program627
{
    public static void main(String A[])
    {
        
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 

        int iMask = 0x00000004;

        int iResult = 0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("8th bit is on.");
        }
        else
        {
            System.out.println("8th bit is off.");
        }
    }
}
