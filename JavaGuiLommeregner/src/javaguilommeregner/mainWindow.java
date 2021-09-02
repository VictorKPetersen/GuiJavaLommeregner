package javaguilommeregner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class mainWindow extends JFrame{
    JPanel mainPanel;
    JTextField numberTextField;
    
    public mainWindow() {
    createComponents();
}
    
    private void createComponents(){
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        
        numberTextField = new JTextField();
        
        numberTextField.setBounds(25, 10, 300, 24);
        
        
        mainPanel.add(numberTextField);
        add(mainPanel);
    }
}


