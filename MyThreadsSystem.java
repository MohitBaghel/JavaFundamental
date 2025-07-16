public class MyThreadsSystem implements Runnable {
    
    public static void main(String[] args) {
        MyThreadsSystem thread = new MyThreadsSystem();
        MyThreadsSystem thread1 = new MyThreadsSystem();
        \
        Thread t = new Thread(thread); // Create a new thread with the Runnable instance
        Thread t1 = new Thread(thread);



        t.start(); // Start the thread\ 
        t1.start(); 
    }

    @Override
    public void run() {
        
        try {
            for(int i = 0; i < 5;  i++){
                System.out.println("Thread is running: " + i);

                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (Exception e) {
                    // TODO: handle exception
                }
               
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    
}


// public class MyThreadsSystem2 implements Runnable {
    
   
//         MyThreadsSystem2 thread = new MyThreadsSystem();
//         Thread t = new Thread(thread); // Create a new thread with the Runnable instance
//         t.start(); // Start the thread


//     @Override
//     public void run() {
        
//         try {
//             for(int i = 0; i < 5;  i++){
//                 System.out.println("Thread is running: " + i);

//                 try {
//                     Thread.sleep(1000); // Sleep for 1 second
//                 } catch (Exception e) {
//                     // TODO: handle exception
//                 }
               
//             }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }

    
// }