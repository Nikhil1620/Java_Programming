import java.util.*;

class program296
{
    public static void main(String A[])
    {
        Vector <String> vobj = new Vector <String>();

        vobj.add("c");
        vobj.add("c++");
        vobj.add("java");
        vobj.add("python");
        vobj.add("c#");
        vobj.add("java");

        System.out.println(vobj);

        vobj.add(2,"lsp");

        System.out.println(vobj);

        System.out.println(vobj.capacity());

        System.out.println(vobj.contains("lsp"));

        System.out.println(vobj.contains("Unix"));

        vobj.remove(6);

        System.out.println(vobj);
    }

}