// Display the factors of the given number

import java.util.Scanner;

class program73
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int iValue = sobj.nextInt();

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}