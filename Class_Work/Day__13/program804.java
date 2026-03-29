// 0 1 1 2 3 5 8 13 21 . . . . .

import java.util.*;

/*class Fibonacci
{
    void Display(int iNo, int a, int b, int c)
    {
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print(a+" ");
            c = a + b;
            b = a;
            a = c;            
        }
    }
}
*/

class program804
{
    public static long Fibonacci(int N)
    {
        if(N <= 1)
        {
            return N;
        }
        
        return Fibonacci(N-1) + Fibonacci(N-2);
        
    }

    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();
        long first = 0;
        long second = 1;
        long next = 0;

        int i = 0;

        for(i = 0; i<= iValue;i++)
        {
            System.out.print(Fibonacci(i)+" ");
        }

        System.out.println();

        /*Fibonacci fobj = new Fibonacci();
        fobj.Display(iValue,first,second,next);*/

    }
}