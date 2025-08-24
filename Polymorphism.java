public class Polymorphism {

    public static void main(String[] args) {
        Animalss an1 = new Animalss();
        Animalss an2 = new  Lion();
        Animalss an3 = new Dog();

        an1.sound();
        an2.sound();
        an3.sound();


    }
    
}




class Animalss {
    public void sound(){
        System.out.println("Animals is make sound");
    }
}


class Lion extends Animalss{
    public void sound(){
        super.sound();
        System.out.println("Lion sound");
    }

}



class Dog extends Animalss{
    public void sound(){
        super.sound();
        System.out.println("Dog sound");
    }
}