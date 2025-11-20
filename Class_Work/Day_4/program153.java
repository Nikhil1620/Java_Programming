//Input = 5
//Output = 1 2 3 4 5

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    { 
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+" ");
        }
    }
}

class program153
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
