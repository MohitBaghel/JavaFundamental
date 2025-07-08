public class Polymorphism {

    public static void main(String[] args) {
        Animal an1 = new Animal();
        Animal an2 = new  Lion();
        Animal an3 = new Dog();

        an1.sound();
        an2.sound();
        an3.sound();


    }
    
}




class Animal {
    public void sound(){
        System.out.println("Animals is make sound");
    }
}


class Lion extends Animal{
    public void sound(){
        super.sound();
        System.out.println("Lion sound");
    }

}



class Dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("Dog sound");
    }
}