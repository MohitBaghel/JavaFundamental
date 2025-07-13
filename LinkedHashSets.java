import java.util.*;

public class LinkedHashSets {

    public static void main(String[] args) {
        
        try {

            LinkedHashSet<String> lhs = new LinkedHashSet<>();
            lhs.add("A");
            lhs.add("B");
            lhs.add("C");
            lhs.add("D");
            lhs.add("F"); 
            lhs.add("E");
            lhs.add("E");
            lhs.add("E");
            lhs.add("F");
            lhs.add("G");

            System.out.println(lhs);
            
            // Iterating through the LinkedHashSet
            for (String s : lhs) {
                System.out.println(s);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
