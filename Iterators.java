import java.util.*;

public class Iterators {

    public static void main(String[] args) {
        try {

            ArrayList<String> al = new ArrayList<>();
            al.add("A");
            al.add("B");
            al.add("C");
            al.add("D");    
            al.add("E");


            Iterator<String> it = al.iterator();
           // System.out.println(it.next());


            while (it.hasNext()) {
                System.out.println(it.next());
                it.remove();
               
               
                
            }

            System.out.println(al);
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
