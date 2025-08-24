import java.util.*;

public class HashMaps {

    public static void main(String[] args) {
        try {
            HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"Chiniese Food");
        hm.put(2,"Indian Food");
        hm.put(3,"Italian Food");
        hm.put(7,"Mexican Food");
        hm.put(7,"Mexican Food");
        hm.put(5,"American Food");
        hm.put(4,"Mexican Food");
        hm.put(6,"French Food");

        System.out.println(hm.get(3));
        hm.remove(3);
        hm.containsKey(hm.get(2)); // Check if key 2 exists
        hm.keySet(); // Get all keys in the map

        //System.out.println("HashMap: " + hm);

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
           System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        for( String value : hm.values()) {
            //System.out.println("Value: " + value);
        }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
