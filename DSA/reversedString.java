package DSA;

public class reversedString {

    
    public static void main(String[] args) {


        String input = "Mohit";
        String reversed = "";


        for(int i=0; i<input.length(); i++){ // MOHIT
            reversed = input.charAt(i) + reversed; // h =  tihoM

        }


        System.out.println("Reversed String: " + reversed);


        

    }
}


// Mohit -> tihom
// Rohith -> htiror
//bhuvana -> anuvuhb