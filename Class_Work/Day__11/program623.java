
import java.util.Scanner;

class program623
{
    public static void main(String A[])
    {
        
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt(); 

        int iDigit = 0;
        int iCount1 = 0;
        int iCount0 = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            if(iDigit == 1)
            {
                iCount1 = iCount1 + 1;
            }
            else
            {
                iCount0 = iCount0 + 1;
            }
            System.out.print(iDigit);
            iNo = iNo / 2;
        }  
        System.out.println();
        System.out.println("The number of 1s in the Given number is "+iCount1);
        System.out.println("The number of 0s in the Given number is "+iCount0);
    }
}

/*
  Decimal      Hexa_Decimal        Binary
    0              0                0000
    1              1                0001
    2              2                0010
    3              3                0011
    4              4                0100
    5              5                0101
    6              6                0110
    7              7                0111
    8              8                1000
    9              9                1001
    10             a                1010
    11             b                1011
    12             c                1100
    13             d                1101
    14             e                1110
    15             f                1111

   Hexa Decimal Number formation

    1011     1111      1000     0101     0011     1011     1110     0001
    b        f        8        5         3        b      e        1

    No = 0xbf853be1
*/
