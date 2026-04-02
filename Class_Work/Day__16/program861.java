import java.util.*;

class program861
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
        int MaxIndex = 0;

        for(int i = 0; i < Arr.length; i++)    //"For each loop"
        {
            if(Arr[i].length() > lLength)
            {
                lLength = Arr[i].length();
                MaxIndex = i;
            }
            
        }

        System.out.println(Arr[MaxIndex]+" is the longest word"+" has the length "+lLength);
    }
}