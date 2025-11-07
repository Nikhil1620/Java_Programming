// Display the factors of the given number

import java.util.Scanner;
class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

                                            //Change
        for(iCnt = 1; (iCnt <= (iNo/2)) && (iSum < iNo); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }   
            
        }

        return(iSum == iNo);
    }
}// End of Number class

class program84
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        boolean bResult = false;

        Number nobj = new Number();
        bResult = nobj.CheckPerfect(iValue);

        if(bResult == true)
        {
            System.out.println("The given number is Perfect number.");
        }
        else
        {
            System.out.println("The given number is not Perfect number.");
        }

        //Important
        
        sobj = null;
        nobj = null;

        System.gc();

    }
}