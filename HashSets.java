import java.util.*; 

public class HashSets {

    public static void main(String[] args) {
        try {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("Apple");
            hashSet.add("Banana");
            hashSet.add("Cherry");
            hashSet.add("Fig");
            hashSet.add("Date");
            hashSet.add("Elderberry");
            hashSet.add("Fig");
            hashSet.add("Grape");
            hashSet.add("Date");

        //    get() vs conatins()


            hashSet.remove("Apple");
            System.out.println("Initial HashSet: " + hashSet);


            System.out.println(hashSet.contains("Banana")); // Check if "Banana" is in the set

            System.out.println("Size of HashSet: " + hashSet.size()); // Get the size of the set

        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
