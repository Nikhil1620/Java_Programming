// Display the factors of the given number

import java.util.Scanner;
class Number
{
    public long CalculateFactorial(int iNo)
    {
        int iCnt = 0;
        long iMulti = 1;     //Important

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iCnt = iNo

        while(iCnt >= 1)
        {
             iMulti = iMulti * iCnt; 
             iCnt--;
        }

        return iMulti;
    }
}// End of Number class

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        long iResult = 0;

        Number nobj = new Number();
        iResult = nobj.CalculateFactorial(iValue);

        System.out.println("The Factorial of "+iValue+" is "+iResult);


        //Important
        
        sobj = null;
        nobj = null;

        System.gc();

    }
}