public class Abstraction {

    public static void main(String[] args) {

        Bird an = new Bird(); // cannot able to create the object of these class
        an.sound();
        an.animalsound1();
    
        
    }
    
}



abstract class Animal{

    public abstract void sound();

    public abstract void animalsound1();


 

}



class Bird extends Animal{

       public  void sound(){
         System.out.println("Creep creep");
        }

        public void animalsound1(){
            System.out.println("Sound ");
        }
}