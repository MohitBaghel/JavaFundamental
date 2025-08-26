public class Exceptions {

    public static void main(String[] args) {
    
        int [] arr = {1,2,3,44,5,6,7,89};


    // try{
    //     // some code

    //     System.out.println(arr.length);

    // } catch(Exception e){
    //     e.printStackTrace();
    //     e.toString();
    //     e.getMessage();
    //     System.out.println("Exception is visible here :::::"+e);
    // } finally {
    //     System.out.println("final is here!!!");
    // }


    // System.out.println("out is here!!!");

try {
    System.out.println("this is outer block");
    try{
        int a = 10/0; // divide by 0

    } catch(ArithmeticException e){
        System.out.println("Inner catch :"+ e);
    }

    String str = null;
    System.out.println(str.length());

} catch(NullPointerException e){
    System.out.println("outer catch:"+e);
}  catch(ArrayIndexOutOfBoundsException e){

} catch(NumberFormatException e){
    
}
    
}

}