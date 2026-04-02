import java.util.*;

class program868
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");

        StringBuffer sb = null;

        String str = sobj.nextLine();
        
        str = str.trim();
        
        str = str.replaceAll("//s+"," ");

        String Arr[] = str.split(" ");
        StringBuffer FinalStr = new StringBuffer();

        System.out.println("Number of words are "+Arr.length);

        for(int i = 0; i < Arr.length; i++)    
        {
            sb = new StringBuffer(Arr[i]);
            (FinalStr.append(sb.reverse())).append(" ");   //Modification
        }

        System.out.println(FinalStr);
        System.out.println(FinalStr.length());
        System.out.println(str.length());
        
    }
}