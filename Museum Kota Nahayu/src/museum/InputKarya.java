package museum;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InputKarya {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputKarya window = new InputKarya();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InputKarya() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Masukkan Informasi Karya");
		lbl1.setBounds(89, 0, 254, 54);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Dialog", Font.BOLD, 16));
		frame.getContentPane().add(lbl1);
		
		textField = new JTextField();
		textField.setBounds(159, 65, 215, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 96, 215, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 127, 215, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(159, 159, 215, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lbl2 = new JLabel("id_karya");
		lbl2.setBounds(58, 63, 67, 22);
		lbl2.setFont(new Font("Dialog", Font.BOLD, 13));
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("nama_karya");
		lbl3.setBounds(58, 125, 77, 22);
		lbl3.setFont(new Font("Dialog", Font.BOLD, 13));
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("jenis_karya");
		lbl4.setBounds(58, 94, 77, 22);
		lbl4.setFont(new Font("Dialog", Font.BOLD, 13));
		frame.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("id_seniman");
		lbl5.setBounds(58, 157, 77, 22);
		lbl5.setFont(new Font("Dialog", Font.BOLD, 13));
		frame.getContentPane().add(lbl5);
		
		JButton btnNewButton = new JButton("Tambahkan");
		btnNewButton.setBounds(171, 205, 124, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
