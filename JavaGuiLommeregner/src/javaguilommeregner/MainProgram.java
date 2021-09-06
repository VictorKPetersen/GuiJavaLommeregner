package javaguilommeregner;

import javax.swing.JFrame;

public class MainProgram {

    public static void main(String[] args) {
        
        //Creates new frame from the child mainWindow
        JFrame window = new mainWindow();
        
        window.setSize(380, 470);
        window.setTitle("One stop calculator");
        
        //Sets the cross in the left corner of the GUI as an exit function
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Eneables you to actually see the frame
        window.setVisible(true);
    }
    
}
