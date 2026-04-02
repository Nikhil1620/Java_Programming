import java.util.*;

class program859
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

        int lLength = 0;

        for(int i = 0; i < Arr.length; i++)    //"For each loop"
        {
            if(Arr[i].length() > lLength)
            {
                lLength = Arr[i].length();
            }
            
        }

        System.out.println("The length of the longest word in the string is "+lLength);

    }
}