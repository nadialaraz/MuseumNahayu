package museum;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;

public class Karya {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Karya window = new Karya();
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
	public class karya extends javax.swing.JFrame {
	      private void tampilkan_data_send() {
	        DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("id_karya");
	        model.addColumn("jenis_karya");
	        model.addColumn("nama_karya");
	        model.addColumn("id_seniman");
	        
	        try {
	            String sql = "SELECT * FROM only_send";
	            java.sql.Connection conn = (Connection)konfig.configDB();
	            java.sql.Statement stm = conn.createStatement();
	            java.sql.ResultSet res = stm.executeQuery(sql);
	            
	            while (res.next()) {
	                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
	                
	            }
	           jTable2.setModel(model);
	        } catch (SQLException e) {
	            System.out.println("Error : " + e.getMessage());
	        }
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
		
		JLabel lbl1 = new JLabel("Daftar Karya di Museum Nahayu");
		lbl1.setBounds(83, 0, 278, 44);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Dialog", Font.BOLD, 16));
		frame.getContentPane().add(lbl1);
		
		JButton btnNewButton = new JButton("Masukkan Karya Baru");
		btnNewButton.setBounds(250, 229, 176, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(25, 40, 386, 178);
		frame.getContentPane().add(table);
	}
}
