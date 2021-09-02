package javaguilommeregner;

import javax.swing.JFrame;

public class MainProgram {

    public static void main(String[] args) {
        JFrame window = new mainWindow();
        window.setSize(360, 580);
        window.setTitle("One stop calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
