/*
input:
        iRow = 4
        iCol = 4

Output:
        *
        * *
        * * *
        * * * *
    
    Diagonal Pattern(For this kind of Question the Rows and coloumns should be same)
*/

import java.util.Scanner;

class Pattern
{
    //Filter for square matrix
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input.");
            System.out.println("Row number and coloumn number should be same.");

            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j | i > j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

class program194
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