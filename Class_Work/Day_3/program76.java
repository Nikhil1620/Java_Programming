
import java.io.*;

class program76
{
    public static void main(String A[]) throws IOException
    {
        int iCnt = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        
        int iValue = Integer.parseInt(bobj.readLine());

        for(iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}