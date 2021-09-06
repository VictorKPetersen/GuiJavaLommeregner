package javaguilommeregner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class mainWindow extends JFrame implements ActionListener{
    //Class Variables used for easier creation of elemnts and preset x, y, lenght and height variables
    //Button Possitions and size
    int x = 10;
    int y = 84;
    int buttonLength = 80;
    int buttonHeight = 60;
    
    //Panel and central text field
    JPanel mainPanel;
    JTextField numberTextField;
    
    //Numer 0-9 buttons
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    
    //Special calculator buttons
    JButton btnEquals;
    JButton btnClear;
    JButton btnBackspace;
    JButton btnDot;
    
    //Basic mathematical operator buttons
    JButton btnPlus;
    JButton btnMinus;
    JButton btnMultiply;
    JButton btnDivide;
    
    //Constructer that calls a function which creates all elements
    public mainWindow() {
    createComponents();
}
    
    //Function that creates all elements
    private void createComponents(){
        mainPanel = new JPanel();
        //Sets the layout type to a null layout
        mainPanel.setLayout(null);
        
        numberTextField = new JTextField();
        
        //Button Creation
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        
        btnEquals = new JButton("=");
        btnClear = new JButton("C");
        btnBackspace = new JButton("<--");
        btnDot = new JButton(".");
        
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        
        //ActionListeners bruges til at checke om der bliver klikket på knapperne
        btnEquals.addActionListener(this);
        btnClear.addActionListener(this);
        btnBackspace.addActionListener(this);
        btnDot.addActionListener(this);
        
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        
        
        //SetBounds sets the positon and size of the Element
        numberTextField.setBounds(25, 10, 300, 24);
        
        //Level 1
        btnClear.setBounds(x, y, buttonLength, buttonHeight);
        btnBackspace.setBounds(x + buttonLength, y, 2*buttonLength, buttonHeight);
        
        //Level 2
        btn1.setBounds(x, y + buttonHeight, buttonLength, buttonHeight);
        btn2.setBounds(x + buttonLength, y + buttonHeight, buttonLength, buttonHeight);
        btn3.setBounds(x + 2*buttonLength, y + buttonHeight, buttonLength, buttonHeight);
        btnPlus.setBounds(x + 3*buttonLength, y + buttonHeight, buttonLength, buttonHeight);
        
        //Level 3
        btn4.setBounds(x, y + 2*buttonHeight, buttonLength, buttonHeight);
        btn5.setBounds(x + buttonLength, y + 2*buttonHeight, buttonLength, buttonHeight);
        btn6.setBounds(x + 2*buttonLength, y + 2*buttonHeight, buttonLength, buttonHeight);
        btnMinus.setBounds(x + 3*buttonLength, y + 2*buttonHeight, buttonLength, buttonHeight);
        
        //Level 4
        btn7.setBounds(x, y + 3*buttonHeight, buttonLength, buttonHeight);
        btn8.setBounds(x + buttonLength, y + 3*buttonHeight, buttonLength, buttonHeight);
        btn9.setBounds(x + 2*buttonLength, y + 3*buttonHeight, buttonLength, buttonHeight);
        btnMultiply.setBounds(x + 3*buttonLength, y + 3*buttonHeight, buttonLength, buttonHeight);
        
        //Level 5
        btnDot.setBounds(x, y + 4*buttonHeight, buttonLength, buttonHeight);
        btn0.setBounds(x + buttonLength, y + 4*buttonHeight, buttonLength, buttonHeight);
        btnEquals.setBounds(x + 2*buttonLength, y + 4*buttonHeight, buttonLength, buttonHeight);
        btnDivide.setBounds(x + 3*buttonLength, y + 4*buttonHeight, buttonLength, buttonHeight);
        
        
        //panel.add adds the element to the specified panel
        
        //Level 1
        mainPanel.add(btnClear);
        mainPanel.add(btnBackspace);
        
        //Level 2
        mainPanel.add(btn1);
        mainPanel.add(btn2);
        mainPanel.add(btn3);
        mainPanel.add(btnPlus);
        
        //Level 3
        mainPanel.add(btn4);
        mainPanel.add(btn5);
        mainPanel.add(btn6);
        mainPanel.add(btnMinus);
        
        //Level 4
        mainPanel.add(btn7);
        mainPanel.add(btn8);
        mainPanel.add(btn9);
        mainPanel.add(btnMultiply);
        
        //Level 5
        mainPanel.add(btnDot);
        mainPanel.add(btn0);
        mainPanel.add(btnEquals);
        mainPanel.add(btnDivide);
        
        mainPanel.add(numberTextField);
        
        //Adds the mainPanel with everything in it to the Frame
        add(mainPanel);
    }

    //Action Performed metode, Metode som køres når en kanp bruges
    @Override
    public void actionPerformed(ActionEvent e) {
        String sequence = numberTextField.getText(); //Creates a String with the same content as numberTextField
        String pressedButton = e.getActionCommand(); //Creates a String which contains the button that was pressed
        
        if(pressedButton.charAt(0) == 'C') {numberTextField.setText("");} //Checks if the pressed button had a specific charecther at index = 0, if true it performs and action
        
        else if (pressedButton.charAt(0) == '=') {numberTextField.setText(Calculate(sequence));} //If true it calls the calculate method and sends the sequence in as a parameter
        
        else if (pressedButton.charAt(0) == '<') { //If true tries a try catch statement that checks if removing a characther puts the length in negatives.
            try {
        numberTextField.setText(sequence = sequence.substring(0, sequence.length() - 1)); //Takes the sequence and creates a substring at the first char and 1 below the max.
        } catch(StringIndexOutOfBoundsException Ex) {
        System.out.println(Ex);   
        }}
        
        else {numberTextField.setText(numberTextField.getText() + pressedButton);} //If none of the buttons are special operatores it sets the text of the field to the current text + the pressed button
        
    }
    
    public static String Calculate(String sequence) { //Method used for calculations
      char[] charArray = sequence.toCharArray(); //Creates an arrays of chars. The chars are added from the sequnce using the toCharArray() method
      
      //Varibles used throughout the calculations
      String firstOperand = "";
      String secondOperand = "";
      String operator = "";
      double result = 0;

      for (int i = 0; i < charArray.length; i++) {
         if (charArray[i] >= '0' && charArray[i] <= '9' || charArray[i] == '.') {
            if(operator.isEmpty()){
               firstOperand += charArray[i];
            }else{
               secondOperand += charArray[i];
            }
         }  

         if(charArray[i] == '+' || charArray[i] == '-' || charArray[i] == '/' || charArray[i] == '*') {
            operator += charArray[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(firstOperand) + Double.parseDouble(secondOperand));
      else if (operator.equals("-"))
         result = (Double.parseDouble(firstOperand) - Double.parseDouble(secondOperand));
      else if (operator.equals("/"))
         result = (Double.parseDouble(firstOperand) / Double.parseDouble(secondOperand));
      else
         result = (Double.parseDouble(firstOperand) * Double.parseDouble(secondOperand));
      
      String s = Double.toString(result);
      return s;
   }    
}
