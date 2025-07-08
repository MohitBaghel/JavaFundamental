public class Interfaces {
    public static void main(String[] args) {
        
    }
    
}



interface Animal{

    public void animalsound();
    public void run();

}

interface Vehicle{

    public void animalsound();
    public void run();

}



class Cat implements Animal, Vehicle{

    public void animalsound(){
        System.out.println("Sounds");
    }

    public void run(){
        System.out.println("run");
    }
}


// enum , exceptional