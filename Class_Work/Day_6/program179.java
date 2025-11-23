/*
input:
        iRow = 4
        iCol = 4

Output:
        a b c d
        e f g h
        i j k l
        m n o p

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = 'a';

        for(i = 1; i <= iRow; i++)
        {

            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
                ch++;          //Import (to Reset)
            }
            System.out.println();
        }
    }
}

class program179
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