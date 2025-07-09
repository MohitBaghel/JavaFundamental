import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        LocalDateTime lc = LocalDateTime.now(); // create date
        System.out.println(lc);


    DateTimeFormatter dm = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formaDate = lc.format(dm);
    System.out.println(formaDate);

    }
    
}


//on 15th july we have support/Doubt