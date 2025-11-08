// Display the digit in reverse order

import java.util.Scanner;

class Digit
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iResult = 0;

        Digit dobj = new Digit();
        iResult = dobj.SumDigit(iValue);

        System.out.println("The sum of digits is "+iResult);

        //Important
        
        sobj = null;
        dobj = null;

        System.gc();

    }
}