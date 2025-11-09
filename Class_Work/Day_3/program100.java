import java.util.Scanner;

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

class program100
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the Size of Array :  ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];   //Memory Allocation

        System.out.println("Enter the Elements : ");

        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        //Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}