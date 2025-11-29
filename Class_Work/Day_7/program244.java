//Input : Hello
//Output : H e l l o

import java.util.Scanner;

class StringX
{
    public void Display(String str)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }
    }
}

class program244
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.Display(sobj);
        

    }
}