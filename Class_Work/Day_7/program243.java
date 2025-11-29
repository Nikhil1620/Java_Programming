//Input : Hello
//Output : H e l l o

import java.util.Scanner;

class program243
{
    public static void main(String A[]) throws Exception
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }

    }
}