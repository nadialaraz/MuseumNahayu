package museum;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HalamanMasuk {

	private JFrame frmMuseumNahayu;
	private JFrame frmMuseumNahayu_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HalamanMasuk window = new HalamanMasuk();
					window.frmMuseumNahayu_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HalamanMasuk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMuseumNahayu = new JFrame();
		frmMuseumNahayu.setTitle("Museum Nahayu");
		frmMuseumNahayu.setBounds(100, 100, 659, 517);
		frmMuseumNahayu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmMuseumNahayu_1 = new JFrame();
		frmMuseumNahayu_1.getContentPane().setBackground(Color.CYAN);
		frmMuseumNahayu_1.setForeground(Color.CYAN);
		frmMuseumNahayu_1.setBackground(Color.LIGHT_GRAY);
		frmMuseumNahayu_1.setBounds(100, 100, 450, 343);
		frmMuseumNahayu_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMuseumNahayu_1.getContentPane().setLayout(null);

		JLabel lbl2 = new JLabel("id_petugas");
		lbl2.setBounds(64, 173, 97, 22);
		lbl2.setFont(new Font("Dialog", Font.BOLD, 13));
		frmMuseumNahayu_1.getContentPane().add(lbl2);

		JLabel lbl1 = new JLabel("nama_petugas");
		lbl1.setBounds(64, 142, 97, 20);
		lbl1.setFont(new Font("Dialog", Font.BOLD, 13));
		frmMuseumNahayu_1.getContentPane().add(lbl1);

		JLabel lbl3 = new JLabel("Selamat Datang di Museum Kota Nahayu!");
		lbl3.setBounds(48, 38, 337, 41);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Dialog", Font.BOLD, 16));
		frmMuseumNahayu_1.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("Masukkan Nama dan ID Anda");
		lbl4.setBounds(136, 77, 249, 41);
		frmMuseumNahayu_1.getContentPane().add(lbl4);
		
		textField = new JTextField();
		textField.setBounds(182, 143, 203, 20);
		frmMuseumNahayu_1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 175, 204, 20);
		frmMuseumNahayu_1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("MASUK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(textField.getText().equals(HalamanMasuk.)&&(textField_1.getText().equals(HalamanMasuk.Username))){
		              PilihRole pr = new PilihRole();
		            pr.setVisible(true);
		            pr.pack();
		            pr.setLocationRelativeTo(null);
		            pr.setDefaultCloseOperation(HalamanMasuk.EXIT_ON_CLOSE);  
		        } else {
		            jLabel8.setText("Input yang dimasukkan salah!");*/
			}
		});
		btnNewButton.setBounds(180, 227, 89, 23);
		frmMuseumNahayu_1.getContentPane().add(btnNewButton);

		
	}
}

