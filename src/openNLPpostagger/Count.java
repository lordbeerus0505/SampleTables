package openNLPpostagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count {
    public static String Count(String c)
    {    /*
            Finding the average of all elements in the column c_sales
         */
        return "COUNT("+c+")";
    }
    public static void main(String[] args) throws IOException{

        String s1 = " type of c_productid and t_pokemon";
        String s=s1;
        //String c="c_sales";
        List<String> l = Files.readAllLines(Paths.get("Count.txt"));
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

        //System.out.println(col1);
        //System.out.println(list);

        for (String t:list)
        {
            if(l.containsAll(Collections.singleton(t)))
            {s=Count(col1);
                break;}
             else
                 s="";

        }
        System.out.println(s);
    }
}
