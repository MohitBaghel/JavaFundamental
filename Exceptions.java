public class Exceptions {

    public static void main(String[] args) {
    
        int [] arr = {1,2,3,44,5,6,7,89};


    try{
        // some code

        System.out.println(arr[9]);

    } catch(Exception e){
        System.out.println("Exception is visible here :::::"+e);
    } finally {
        System.out.println("final is here!!!");
    }


    System.out.println("out is here!!!");

    
    
}

}