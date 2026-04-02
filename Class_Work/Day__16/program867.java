import java.util.*;

class program867
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
            sb.reverse();
            FinalStr.append(sb);
            FinalStr.append(" ");
        }

        System.out.println(FinalStr);
        
    }
}