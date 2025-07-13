import java.util.*;
public class TreeMaps {

    public static void main(String[] args) {
        try {
            TreeMap<String, Integer> tm = new TreeMap<>();
            tm.put("A", 1);
            tm.put("D", 4);
            tm.put("E", 5);
            tm.put("B", 2);
            tm.put("C", 3);
            tm.put("D", 4);
            tm.put("E", 5);
            tm.put("F", 6);
            tm.put("G", 7);

            System.out.println(tm);

            // Iterating through the TreeMap
            for (Map.Entry<String, Integer> entry : tm.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
