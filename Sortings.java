import java.util.*;;

public class Sortings {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(21);
        num.add(12);
        num.add(45);
        num.add(2);
        num.add(10);
        num.add(5);
        num.add(1);
        num.add(100);
        num.add(50);
        num.add(90);
        num.add(30);

            // Collections.sort(num);
            // Collections.reverse(num);
            Collections.sort(num);
            Collections.shuffle(num);

        for( int i: num){
            System.out.print(i + ", ");
        }
    }
    
}
