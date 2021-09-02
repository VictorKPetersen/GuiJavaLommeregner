package javaguilommeregner;

import javax.swing.JFrame;

public class MainProgram {

    public static void main(String[] args) {
        JFrame window = new mainWindow();
        window.setSize(300, 400);
        window.setTitle("Calc");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
