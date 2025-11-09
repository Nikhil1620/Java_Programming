
class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program97
{
    public static void main(String A[])
    {
        int Arr[] = new int[4];

        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);
    }
}