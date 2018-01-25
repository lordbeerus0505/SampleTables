package openNLPpostagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Average {
    public static String Avg(String c)
    {    /*
            Finding the average of all elements in the column c_sales
         */
        return "AVG("+c+")";
    }
    public static void main(String[] args) throws IOException {
        String s = "average c_price of all products";
        //String c="c_sales";
        List<String> l = Files.readAllLines(Paths.get("Average.txt"));
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
            {s=Avg(col1);
                break;}

        }
        System.out.println(s);

    }
}
