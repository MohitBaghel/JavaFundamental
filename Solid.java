public class Solid {

    public static void main(String[] args) {
        
    }
    
}


// S: Single Responsibility Principle : 
// O : Open/Closed Principle
// L : Liskov Substitution Principle
// I : interface Segregation Principle
// D: Dependency Inversion Principle



// Single Responsibility Principle :

 class Book{

    private String name;
    private String author;
    private String text;

    // constructors and getters/setters




}


class  BookPrinter{


    void printBook(){
        // todo
    }

    void printintoAnothertext(){

    }
}

class BookFunctional{

    public String replaceWordIntext(String word, String replaceWord){
        return text.replace(word, replaceWord);

    }


    public boolean isWordInText(String word){
        return text.contains(word);
    }

}

// open/closed principle



class car{
    private String make;
    private String model;
    private int year;
    private String color;

    //
}



class carModification extends car{

    private String alloyWheel;


}

// Liskov Substitution Principle
 

 interface cars {

    void turnOnEngine();
    void accelerate();

    
}

 class motorCar implements cars {

    @Override
    public void turnOnEngine() {
        System.out.println("Engine turned on");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    
}


 class ElectricCar implements cars {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have engine")
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car is accelerating silently");
    }

    
}


 interface LionKeeper {


    void feedLion();
    void cleanLionCage();
    void trainLion();


    
}


interface feedLion{
    void feedLion();
}


interface cleanLionCage{
    void cleanLionCage();
}


interface trainLion{
    void trainLion();
}



class LionKeeperImpl implements  trainLion{

}


// Dependency Inversion Principle

class LCDWindowPC{


    private final StandardKeyboard keyboard;
    private final StandardMouse mouse;
    private final StandardMonitor monitor;



    public LCDWindowPC(){

        monitor = new StandardMonitor();// tight
        keyboard = new StandardKeyboard();
        mouse = new StandardMouse();
    }


    public  LCDWindowPC(StandardKeyboard keyboard, StandardMouse mouse, StandardMonitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}



public class StandardKeyboard implements keyboard{
    
    // implementation
}