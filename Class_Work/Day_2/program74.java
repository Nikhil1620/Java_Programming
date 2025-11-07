// Checked Exception

import java.io.*;

class program74
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iValue = Integer.parseInt(bobj.readLine());
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}