public class ChainedException {

    public static void main(String[] args) {
        try{
            // creating
            NumberFormatException ex = new NumberFormatException("Primary Exception");

            //setting the cauze
            ex.initCause(new NullPointerException("Root cause Exception"));

            // throwing the exception
            throw ex;

        } catch(Exception e){
            System.out.println(" Caught Exception: " + e);

            System.out.println("Cause of exception: " + e.getCause());
        }
    }
    
}
