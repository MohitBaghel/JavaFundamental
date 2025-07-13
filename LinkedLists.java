import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        
        try {
            
               LinkedList<String> bikes = new LinkedList<String>();
               bikes.add("KTM");
               bikes.add("Duke");
               bikes.add("Kawasaki");
               bikes.add("Yamaha");
               bikes.add("Honda");

             

               bikes.addFirst("Suzuki");
               bikes.addLast("BMW");
               bikes.add("Honda");

               bikes.remove("Kawasaki");
               bikes.add("Honda");

              
               System.out.println( bikes.get(2));

            
               Collections.sort(bikes, Collections.reverseOrder()); // Sorting the list


               for(String bike: bikes) {
                   System.out.println(bike);
               }
            

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
    }
    
}
