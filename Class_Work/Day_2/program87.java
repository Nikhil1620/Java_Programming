// Display the factors of the given number

import java.util.Scanner;
class Number
{
    public int CalculateFactorial(int iNo)
    {
        int iCnt = 0;
        int iMulti = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
             iMulti = iMulti * iCnt; 
        }

        return iMulti;
    }
}// End of Number class

class program87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iResult = 0;

        Number nobj = new Number();
        iResult = nobj.CalculateFactorial(iValue);

        System.out.println("The Factorial of "+iValue+" is "+iResult);


        //Important
        
        sobj = null;
        nobj = null;

        System.gc();

    }
}