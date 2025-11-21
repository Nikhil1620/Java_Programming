/*
     $ $ $ $
     $ $ $ $ 
     $ $ $ $
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
                System.out.print("$\t");
            }
            System.out.println();

        }
    }
}

class program165
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iValue1 = 0;
        System.out.print("Enter the number of Rows : \n");
        iValue1 = Sobj.nextInt();

        int iValue2 = 0;
        System.out.print("Enter the number of Coloumns : \n");
        iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}
