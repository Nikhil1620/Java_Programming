
import java.util.Scanner;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);
    }
}

class program254
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sobj = strobj.Update(sobj);                //Not Preferable

        System.out.println("Updated String : "+sobj);
        

    }
}