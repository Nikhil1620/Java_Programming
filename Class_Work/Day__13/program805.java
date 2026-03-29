// 0 1 1 2 3 5 8 13 21 . . . . .

import java.util.*;

class program805
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

        System.out.print(dp[0]+" ");
        System.out.print(dp[1]+" ");

        for(i = 2; i <= iSize; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
            System.out.print(dp[i]+" ");
        }

        System.out.println();
    }
}