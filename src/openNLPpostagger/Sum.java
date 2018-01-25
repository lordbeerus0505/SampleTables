package openNLPpostagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {
    public static String Sum(String c) {
        //System.out.println("Inside Sum");
        /*
            Finding the sum of all elements in the column c_sales
         */
        return "SUM("+c+")";
    }

    public static void main(String[] args) throws IOException {
        String s = "Total number of c_sales";
        //String c="c_sales";
        List<String> l = Files.readAllLines(Paths.get("Sum.txt"));
        List<String> list=new ArrayList<String>();
        for (String w : s.split(" ")) {
            list.add(w.toLowerCase());

        }String col1="";
        String col[]=s.split(" ");
        for (int i=0;i<col.length;i++)
        {
            if(col[i].contains("c_"))
            {
                col1=""+col[i];
                break;
            }
        }

        System.out.println(col1);
        //System.out.println(list);

        for (String t:list)
        {
            if(l.containsAll(Collections.singleton(t)))
            {s=Sum(col1);
                break;}

        }
        System.out.println(s);

    }
}
