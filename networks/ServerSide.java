package networks;

import java.io.*;
import java.net.*;


public class ServerSide {

    private Socket socket = null;
    private ServerSocket server = null; 
    private DataInputStream in = null;


    public ServerSide(int port) {
     

        try{

            server = new ServerSocket(port);
            System.out.println("Server started on port: " + port);
            System.out.println("Waiting for a client...");
            socket = server.accept(); // Accept client connection
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());


            in = new DataInputStream(new BufferedInputStream( socket.getInputStream())); // Input stream from client
            String message = "";

            while (!message.equals("End")) {
                try{

                    message = in.readUTF(); // Read message from client
                    System.out.println("Client says: " + message);
                    
                    
                } catch (Exception e) {
                    System.out.println("Error reading from client: " + e.getMessage());
                    break;
                }

                System.out.print("Close Connection ");
                socket.close();
                in.close();
                
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerSide server = new ServerSide(8080); // Start server on port 5000
    }
    
}
