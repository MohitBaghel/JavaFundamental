import java.util.*;

public class TreeSets {
    public static void main(String[] args) {
        try {
            TreeSet<String> ts = new TreeSet<>();
            ts.add("A");
            ts.add("B");
            ts.add("D");
            ts.add("E");
            ts.add("F");
            ts.add("C");
            ts.add("D"); 
            ts.add("C");
           
            ts.add("G");

            System.out.println(ts);
            
            // Iterating through the TreeSet
            for (String s : ts) {
                System.out.println(s);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
