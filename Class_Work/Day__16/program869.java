import java.util.*;

class program869
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

        String ret = new String(FinalStr);

        ret = ret.trim();

        System.out.println(ret);
        System.out.println(ret.length());
        
    }
}