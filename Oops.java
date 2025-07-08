import java.util.*;


public class Oops {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    sc.close();

   InnerOops ops1 = new InnerOops(3, 20);
   ops1.x = 26;
   System.out.println(ops1.x);


   Encapsulation user = new Encapsulation();
   user.setName("XYZ");
   System.out.println(user.getName());
}
    

public static class InnerOops {
     int x = 10;
     int y = 20;
    

    public  InnerOops(int x, int y){
        x = this.x;
        y = this.y;

    }
}





}





