// Display the factors of the given number

class program72
{
    public static void main(String A[])
    {
        int iNo = 12;

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}