// Display the factors of the given number

import java.util.Scanner;
class Number
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }   
        }
    }
}// End of Number class

class program77
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.DisplayFactors(iValue);

    }
}