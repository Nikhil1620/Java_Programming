// Display the digit in reverse order

import java.util.Scanner;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class program90
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        long iResult = 0;

        Digit dobj = new Digit();
        dobj.DisplayDigit(iValue);

        //Important
        
        sobj = null;
        dobj = null;

        System.gc();

    }
}