import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window{

    private JButton to_F;
    private JTextField textField1;
    private JButton to_C;
    private JPanel P1;
    Temp_Conv t = new Temp_Conv();

    public window() {
        to_F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textField1.getText());
                //t.convertToF(value);
                JOptionPane.showMessageDialog(null, t.convertToF(value)+" F");
            }
        });
        to_C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textField1.getText());
                t.convertToC(value);
                JOptionPane.showMessageDialog(null, t.convertToC(value) + " C");
            }
        });
    }


        public static void main(String[] args){

            JFrame frame = new JFrame("Temperature Converte");
            frame.setContentPane(new window().P1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

}
