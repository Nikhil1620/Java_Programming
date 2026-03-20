
import java.util.Scanner;

class program619
{
    public static void main(String A[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 

        int iDigit = 0;
        int iCount1 = 0;
        int iCount0 = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            if(iDigit == 1)
            {
                iCount1 = iCount1 + 1;
            }
            else
            {
                iCount0 = iCount0 + 1;
            }
            System.out.print(iDigit);
            iNo = iNo / 2;
        }  
        System.out.println();
        System.out.println("The number of 1s in the Given number is "+iCount1);
        System.out.println("The number of 0s in the Given number is "+iCount0);
    }
}
