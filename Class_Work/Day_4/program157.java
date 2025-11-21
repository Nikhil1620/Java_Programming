//Input = 6
//Output = -6 -5 -4 -3 -2 -1

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    { 
        int iCnt = 0;

        for(iCnt = -iNo; iCnt <= -1; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class program157
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.print("Enter the frequency : \n");
        iValue = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}
