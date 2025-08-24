import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    TextField textField;
    Button[] b = new Button[16];
    String[] labels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };

    public Calculator() {
        setSize(600, 600);
        setLayout(null);
        setTitle("Calculator");

        textField = new TextField();
        textField.setBounds(50, 50, 500, 50);
        add(textField);

        int x = 50, y = 150;
        for (int i = 0; i < labels.length; i++) {
            b[i] = new Button(labels[i]);
            b[i].setBounds(x, y, 100, 50);
            b[i].addActionListener(this); // Add ActionListener
            add(b[i]);

            x += 135;
            if ((i + 1) % 4 == 0) {
                x = 50;
                y += 80;
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent act) {
        String cmd = act.getActionCommand();
        System.out.println("Button clicked: " + cmd);
        // Example behavior: append button text to textField
        if (cmd.equals("=")) {
            try {
                // Simple eval using ScriptEngine
                javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
                javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String result = engine.eval(textField.getText()).toString();
                textField.setText(result);
            } catch (Exception e) {
                textField.setText("Error");
            }
        } else {
            textField.setText(textField.getText() + cmd);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}



// fun add(){
 
    
// }


//  fun sub(){

//  }