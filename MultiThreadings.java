public class MultiThreadings extends Thread {

    public static int count = 0;
    public static void main(String[] args) {

       MultiThreadings thread = new MultiThreadings();
        thread.start(); // Start the thread 


        while(thread.isAlive()){
            System.out.println("Wait at that time");
        }

        System.out.println("count: " + count);
        count++;
        System.out.println("count: " + count);

    }
    

    public void run() {
       count++;
    }
}

// by runnable interface 
// public class MultiThreadings implements Runnable {
//     public static void main(String[] args) {

//        MultiThreadings thread = new MultiThreadings();

//        Thread t = new Thread(thread); // Create a new thread with the Runnable instance
//         t.start(); // Start the thread 
//     }
    

//     public void run() {
//         System.out.println("Thread is running");
//     }
// }
