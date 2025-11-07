
import java.io.*;

class program75
{
    public static void main(String A[]) 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        try
        {
            int iValue = Integer.parseInt(bobj.readLine());
        }
        catch(IOException iobj)
        {}
        
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