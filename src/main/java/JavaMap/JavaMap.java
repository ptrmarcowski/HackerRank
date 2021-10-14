package JavaMap;
import java.util.*;
import java.io.*;

class JavaMap {
    public static void main(String []arg)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> contacts = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            contacts.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try {
                int temp = contacts.get(s);
                System.out.println(s+"="+temp);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
    }
}