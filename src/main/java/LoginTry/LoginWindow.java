package LoginTry;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {
    //this class should only describe the window
    public LoginWindow() {
        //have to describe the window
          setTitle("Login");    //name
          setSize(300,200); //in pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Process should be closed when hitting the x button
        setLocationRelativeTo(null);    //center the window
        setLayout(new BorderLayout());  //Default is BorderLayout, splits the screen into segments

        JButton button = new JButton("Login");
        JTextField tf_username = new JTextField();
        JPasswordField tf_password = new JPasswordField();

        JPanel panel = new JPanel(new GridLayout(2,2,10,10));   //in pixels //Panel is an invisible area where you can place components

        //adding components directly to the panel
        panel.add(new JLabel("Username:"));
        panel.add(tf_username);
        panel.add(new JLabel("Password:"));
        panel.add(tf_password);

        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        //we have to grab the button
        button.addActionListener(e -> {JOptionPane.showMessageDialog(null, "Hello " + tf_username.getText());});   //when someone hits the button this code will be execuded

    }
}
