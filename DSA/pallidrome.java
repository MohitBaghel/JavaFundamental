package DSA;

public class pallidrome {

    public static void main(String[] args) {

        String input = "deed"; // nitin, deed, rotator, noon
        String revered = "";

        for (int i = 0; i < input.length(); i++) { // nitin
            revered = input.charAt(i) + revered; // n -> ni -> nit -> niti -> nitin
        }

        if(input.equals(revered)) { // nitin == nitin
            System.out.println(input + " is a Pallindrome");
        } else {
            System.out.println(input + " is not a Pallindrome");
        }
        
        
    }
    
}
