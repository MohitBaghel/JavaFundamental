import java.awt.Button;
import java.awt.Frame;

public class GUI {
    public static void main(String[] args) {
        
        // component -> containers -> window / panel
        // window -> frame -> dilaog
        // panel -> Applet
        // normal components -> button, label, textfield, checkbox, radio button, list, menu, scroll bar, etc.


        // AWT -> Abstract Window Toolkit

        Frame frame = new Frame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Hello World");
        frame.setLayout(null); // No layout manager


        Button btn  = new Button();
        btn.setLabel("Click Me");
        btn.setBounds(50,50,300,50);
        frame.add(btn);

        Button btn1  = new Button();
        btn1.setLabel("Click Me");
        btn1.setBounds(50,100,300,50);
        frame.add(btn1);

    }
    
}
