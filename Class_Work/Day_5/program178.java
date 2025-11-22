//Input = 8
//Output = z y x w v u t s 

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    { 
        int iCnt = 0;
     // int i = 97;
        char ch = 'z';
        

        for(iCnt = 1; iCnt <= iNo; iCnt++,ch--)
        {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}

class program178
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
