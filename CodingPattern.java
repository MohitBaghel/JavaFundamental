package JavaFundamental;

public class CodingPattern {
    public static void main(String[] args) {
        // Factory 
        // Singelton

        // Product p1 = Product.getProduct("Mobile");
        // p1.show();
        // Product p2 = Product.getProduct("AC");
        // p2.show();

    
    }
}


// Factory Pattern
// class Product{

//     String name;

    

//      private Product(String name){
//                 this.name = name;
//      } 


//      void show(){
//         System.out.println("Product name: "+name);
//      }

//      static  Product getProduct(String name){
//         Product p =  new Product(name);
//         return p;

//      }
// }

// Singelton pattern

// class Product{
//     static Product p = new Product() // create a object a here
//     String name;
    

//     void show(){
//         System.out.println("Product name: "+name);
//     }


//     static Product geProduct(String name){
//         p.name = name;
//         return p;

//     }
// }
