package networks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {


    // initialisation
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;



    // ip and port
    public ClientSide(String address, int port){

        try{

                socket = new Socket(address, port);

                System.out.println("Connected to server: " + address + " on port: " + port);


                input = new DataInputStream(System.in); // in
                output = new DataOutputStream(socket.getOutputStream()); // out



        } catch( Exception e){
            e.printStackTrace();
        }


        String message = "";


        while (!message.equals("End")) {
            try {

                message = input.readLine();
                output.writeUTF(message);

                
            } catch (Exception e) {
                e.printStackTrace();
              
            }


            try {
                

                input.close();
                output.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
                
            }
            
        }

    }


    public static void main(String[] args) {
        ClientSide client = new ClientSide("127.0.0.1", 5000);
    }
    
}
