public class Revision {
    
    public static void main(String[] args) {

        // int i = 10; // integer
        String name  = "java"; // colllection of characters
        char ch = 'a';
        boolean isclassisGoingOn = false;

        float f = 10.5f; // decimal number
        Double d = 10.5;

        byte bytes= 10;
        // System.out.println("byte"+bytes);

        
    
    


//type casting

// byte -> short-> char-> int -> long -> float -> double
// double -> float -> long -> int -> char -> short -> byte

// double d = 9.766;
// int i = (int) d;


// operators
// arithmetic operators =  +, -, *, /, %
// assignment operators = =, +=, -=, *=, /=, %=
// comparison operators = ==, !=, >, <, >=, <=
// logical operators = &&, ||, !



// int a  =10;
// int b = 12;

// System.out.println(a > b);
// //!a == b


// int c =  a % b; // addition , subtraction, multiplication, division, modulus


//  c *= b;
//  c = c * b;

// String str = "Hello World";
// String str2 = "Hello World";
//  str.length();
//  str.charAt(0);
//  str.toUpperCase(); // HELLO WORLD
//  str.toLowerCase(); // hello world
//  System.out.println(str + str2);
//  str.concat(str2);


//  System.out.println(Math.max(a, b)); // 12
//  System.out.println(Math.min(a, b)); // 10
//  System.out.println(Math.sqrt(64)); // 4.0



// if(a > b){
//     System.out.println("a is greater than b");
//     // todo
// }  else if(a == b) {
//     System.out.println("a is equal to b");
//     // todo
// }
// else {
//     System.out.println("b is greater than a");
//     // todo
// }


// for(int i = 0; i < 10; i++) { // 5 < 5

//     if( i==4 ){ // skip 4
//         continue;
//     }
//     System.out.println("Hello World " + i);
// }

// do{
// System.out.println(i);
// i--;
// }
// while(i > 5);

String [] bikes = {"KTM", "BMW", "Yamaha", "Honda", "Suzuki"};
// int arr [] = {1, 2, 3, 4, 5};


// System.out.println("Bike: "+ arr[6]);




for(String var: bikes){
System.out.println("Bike: " + var);
}



    }
}


