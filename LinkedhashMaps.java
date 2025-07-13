import java.util.*;

public class LinkedhashMaps {

    public static void main(String[] args) {
        try {
            LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
            lhm.put("C", 3);
            lhm.put("D", 4);
            lhm.put("A", 1);
            lhm.put("B", 2);
            lhm.put("C", 3);
            lhm.put("D", 4);
            lhm.put("E", 5);
            lhm.put("C", 3);
            lhm.put("D", 4);
            lhm.put("F", 6);
            lhm.put("G", 7);
            lhm.put("C", 3);
            lhm.put("D", 4);
            System.out.println(lhm);

            // Iterating through the LinkedHashMap
            for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
