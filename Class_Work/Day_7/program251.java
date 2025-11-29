
import java.util.Scanner;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z' )
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program251
{
    public static void main(String A[])
    {
        int iResult = 0;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        iResult = strobj.CountSmall(sobj);
        System.out.println("The Frequency capital charcters is : "+iResult);
        

    }
}