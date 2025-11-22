//Input = 5
//Output = a   b  c  d   e
//Index  = 1   2  3  4   5
//ASCII =  97 98 99 100 101

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    { 
        int iCnt = 0;
        int i = 97;

        for(iCnt = 1; iCnt <= iNo; iCnt++,i++)
        {
            System.out.printf("%c\t",i);
        }
        System.out.println();
    }
}

class program174
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
