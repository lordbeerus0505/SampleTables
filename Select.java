import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Select {
    public static String Select(String s) {

        return "SELECT "+s;
    }

    public static void main(String[] args) throws IOException {
        String s = "get the c_price of t_helmet";
        String s1=s;
        //String c="c_sales";
        List<String> l = Files.readAllLines(Paths.get("Select.txt"));
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
            else if(col[i].contains("all")||col[i].contains("every")||col[i].contains("complete")||col[i].contains("each"))
                col1="*";
        }

        //System.out.println(col1);
        //System.out.println(list);

        for (String t:list)
        {
            if(l.containsAll(Collections.singleton(t)))
            {s=Select(col1);
                break;}

        }
        System.out.print(s+" ");
        From obj=new From();
        obj.caller(s1);

    }
}


