public class Inherit {


    // subclass : child
    // superclass : parent
    
}



// parent or Superclass
class Vehicle{



    public void sound(){
        System.out.println("Beep");
    }


}



// child or subclass

class Car extends Vehicle {

    private String model = "BMW";


    public static void main(String[] args) {
        // Car car1 = new Car();
        // car1.sound();



        Bottom tp = new Bottom();
        tp.m1();
        tp.m2();
    
    }

}



// child or subclass
class Bike  extends Vehicle{

}




class Top{
    void m1(){
        System.out.println("m1 in top");
    }


    void m2(){
        System.out.println("m2 in top");
    }
}




class Bottom extends Top{

    void m2(){
        super.m2(); // it will take first parent then child function
        System.out.println("m3 in Bottom");
    }

}


// home work do a program for inheritance by own