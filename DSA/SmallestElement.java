package DSA;

public class SmallestElement {

    public static void main(String[] args) {
        
        int arr [] = {12, 34, 65, 23,8, 78, 84, 16,45};


        int SmallestElement = arr[0]; // Assume first element is the smallest  // 12


        for( int i = 1 ; i< arr.length; i++){
            if(arr[i] < SmallestElement){ //45 < 8 
                SmallestElement = arr[i]; // Update smallest element if current element is smaller  : 8
            }

        }

        System.out.println("Smallest Element in the array is: " + SmallestElement);


    }
    
}


// need find whether the string pallidrome


// nitin -> nitin  
//deed -> deed
// rotator -> rotator
// noon -> noon


