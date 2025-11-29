
import java.util.Scanner;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        String temp = new String(Arr);

        return temp;
    }
}

class program252
{
    public static void main(String A[])
    {
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sRet = strobj.Update(sobj);

        System.out.println("Updated String : "+sRet);
        

    }
}