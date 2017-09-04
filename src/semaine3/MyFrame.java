import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame {

	private JPanel contentPane;
    boolean etat =  false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text = new JLabel("Lets Start");
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setBounds(153, 87, 100, 14);
		contentPane.add(text);
		
		JButton button = new JButton("Click me");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText("On");
			}
		});
		button.setBounds(55, 135, 100, 20);
		contentPane.add(button);
		
		JButton btnUnclickMe = new JButton("Unclick me");
		btnUnclickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText("Off");	
			}
		});
		btnUnclickMe.setBounds(237, 134, 100, 20);
		contentPane.add(btnUnclickMe);
		
		
	}
}
