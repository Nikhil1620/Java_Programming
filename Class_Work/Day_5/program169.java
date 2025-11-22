/*
input:
        iRow = 4
        iCol = 4

Output:
        * * * *
        2 2 2 2
        * * * *
        4 4 4 4

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(i+"\t");
                }
            }
            System.out.println();
        }
    }
}

class program169
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of coloumns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }

}