import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;



public class Frame {
	public static void main(String[] args){

		JFrame frame = new JFrame("My Game by DKIFU");	
		JButton button = new JButton("START");
		

		frame.setSize(1024,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(new BorderLayout());

		button.setFont(button.getFont().deriveFont(30.0f));
		button.setPreferredSize(new Dimension(0, 100));
		frame.add(button, BorderLayout.PAGE_END);


		frame.setVisible(true);
	}
}