package javaguilommeregner;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class mainWindow extends JFrame{
    JPanel mainPanel;
    
    public mainWindow() {
    createComponents();
}
    
    private void createComponents(){
        mainPanel = new JPanel();
        
        add(mainPanel);
    }
}


