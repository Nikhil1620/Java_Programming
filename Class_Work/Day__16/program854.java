import java.util.*;

class program854
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");

        //Step 0
        String str = sobj.nextLine();
        //Step 1
        str = str.trim();

        //step 2
        str = str.replaceAll("//s+"," ");

        //step 3
        String Arr[] = str.split(" ");

        System.out.println("Number of words are "+Arr.length);

        for(String s : Arr)    //"For each loop"
        {
            System.out.println(s);
        }

    }
}