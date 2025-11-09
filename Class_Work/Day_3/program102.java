import java.util.Scanner;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        
        System.out.println("Elements of the Array are : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program101
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int i = 0;
        int iResult = 0;

        System.out.println("Enter the Size of Array :  ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];   //Memory Allocation

        System.out.println("Enter the Elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iResult = aobj.CountEven(Arr);

        System.out.println("Even elements are "+iResult);
        
        //Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}import java.util.Scanner;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        
        System.out.println("Elements of the Array are : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program101
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int i = 0;
        int iResult = 0;

        System.out.println("Enter the Size of Array :  ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];   //Memory Allocation

        System.out.println("Enter the Elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iResult = aobj.CountEven(Arr);

        System.out.println("Even elements are "+iResult);
        
        //Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}import java.util.Scanner;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        
        System.out.println("Elements of the Array are : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program101
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int i = 0;
        int iResult = 0;

        System.out.println("Enter the Size of Array :  ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];   //Memory Allocation

        System.out.println("Enter the Elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        iResult = aobj.CountEven(Arr);

        System.out.println("Even elements are "+iResult);
        
        //Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}