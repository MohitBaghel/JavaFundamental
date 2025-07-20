import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {


        Frame fm = new Frame();
        fm.setSize(600,600);
        fm.setLayout(null);
        fm.setTitle("Calculator");
        fm.setVisible(true);


        TextField textField = new TextField();
        textField.setBounds(50,50,500,50);
        fm.add(textField);



        Button b[] = new Button[16];
        int x= 50, y = 150;
        String s[] = {"7", "8", "9", "/",
                        "4", "5", "6", "*",
                        "1", "2", "3", "-",
                        "0", ".", "=", "+"};


                        for(int i=0; i< s.length; i++){
                            b[i] = new Button(s[i]);
                            b[i].setBounds(x, y, 100, 50);
                        
                            fm.add(b[i]);
                            x += 135;

                            if((i+1) % 4 ==0){
                                x = 50;
                                y += 80;

                            }
                    
                        }

       
    }
    



// Event Handling


public void actionPerformed(ActionEvent act){
        System.out.println("Button clicked: " + act.getActionCommand());
}

}