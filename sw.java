import javax.swing.*; 
import java.awt.Color;  
import java.awt.event.*;

public class sw {  
    public static void main(String[] args) {  
        JFrame f = new JFrame("Button Example");  
        JButton b = new JButton("Click Here");  
        b.setBounds(50, 100, 95, 30);  
        b.setBackground(Color.RED);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new JFrame("New Frame");
                newFrame.setSize(300, 300);
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
                
                JLabel label = new JLabel("This is a new frame!");
                label.setBounds(50, 50, 200, 30); 
                newFrame.add(label);
                newFrame.setLayout(null); 

                newFrame.setVisible(true);
            }
        });

        f.add(b);  
        f.setSize(400, 400);  
        f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true);   
    }  
}
