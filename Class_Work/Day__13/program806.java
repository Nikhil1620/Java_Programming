// 0 1 1 2 3 5 8 13 21 . . . . .

import java.util.*;

class program806
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0;
        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        long dp[] = new long[iSize+1];

        dp[0] = 0;
        dp[1] = 1;

        int i = 0;

        for(i = 2; i < iSize; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        for(i = 0; i< iSize; i++)
        {
            System.out.print(dp[i]+" ");
        }

        System.out.println();
    }
}