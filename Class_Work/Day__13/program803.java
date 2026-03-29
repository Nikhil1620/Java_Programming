// 0 1 1 2 3 5 8 13 21 . . . . .

import java.util.*;

class Fibonacci
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

class program803
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();
        long first = 0;
        long second = 1;
        long next = 0;

        Fibonacci fobj = new Fibonacci();
        fobj.Display(iValue,first,second,next);

    }
}