import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Thank you for using my code :D
//Code by ahmetacr61

public class UICalculator implements ActionListener {
    //Create needed Frame and Panel
    private static JFrame jf = new JFrame();
    private static JPanel jp = new JPanel();
    //Create the "Objects" with which the User will interact
    private static JTextField firstInput = new JTextField("6");
    private static JTextField operator = new JTextField("+");
    private static JTextField secondInput = new JTextField("9");
    private static JButton button = new JButton("Click to calculate");
    private static JLabel outputText = new JLabel("Result:");
    private static JLabel output = new JLabel("69");

    //Main method
    public static void main(String args[]) {
        //Set the options of the Interface (JFrame)
        jf.setResizable(false);
        jf.setSize(400, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Calculator by ahmetacr61");
        jf.setVisible(true);

        Init();

        //Add the JPanel to the JFrame and set no Layout
        jf.add(jp);
        jp.setLayout(null);

    }

    //Funciton to initialize
    private static void Init() {
        firstInput.setBounds(0, 0, 160, 40);
        jp.add(firstInput);

        operator.setBounds(158, 0, 69, 40);
        operator.setHorizontalAlignment(JTextField.CENTER);
        jp.add(operator);

        secondInput.setBounds(225, 0, 160, 40);
        jp.add(secondInput);
        
        button.setBounds(224, 521, 160, 40);
        button.addActionListener(new UICalculator());
        jp.add(button);

        output.setBounds(225, 50, 160, 40);
        jp.add(output);

        outputText.setBounds(225, 35, 160, 40);
        jp.add(outputText);
    }

    //Event for clicking on the Button
    @Override
    public void actionPerformed(ActionEvent e) {

        double input1 = Double.parseDouble(firstInput.getText());
        double input2 = Double.parseDouble(secondInput.getText());

        switch(operator.getText()) {
            case "+":
            output.setText("" + (input1 + input2));
            break;
            case "-":
            output.setText("" + (input1 - input2));
            break;
            case "*":
            output.setText("" + (input1 * input2));
            break;
            case "/":
            output.setText("" + (input1 / input2));
            break;
            default:
            output.setText("Incorrect operator!");
            break;
        }
    }
}
