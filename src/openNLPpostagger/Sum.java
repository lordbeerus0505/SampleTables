package openNLPpostagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {
    static String sum(String c) {
        //System.out.println("Inside Sum");
        /*
            Finding the sum of all elements in the column c_sales
         */
        return "SUM("+c+")";
    }

    public static void main(String [] args) throws IOException {
        String s1= "Average of total c_sales";
        String s = s1;//" number of c_sales";
        //String c="c_sales";
        List<String> l = Files.readAllLines(Paths.get("Sum.txt"));
        List<String> list=new ArrayList<String>();
        for (String w : s.split(" ")) {
            list.add(w.toLowerCase());

        }String col1="";int count=0;
        String col[]=s.split(" ");
        for (int i=0;i<col.length;i++)
        {
            if(col[i].contains("c_"))
            {
                col1=""+col[i];
                count=1;
                break;
            }
        }

        //System.out.println(col1);
        //System.out.println(list);

        for (String t:list)
        {
            if(l.containsAll(Collections.singleton(t))&&count==1)
            {s=sum(col1);
                break;}
            else
                s="";

        }
        System.out.println(s);

    }
}
