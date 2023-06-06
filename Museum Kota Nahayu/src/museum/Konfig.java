package museum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author kevin
 */
public class Konfig {
    
        public static void main (String[] args) {
            HalamanMasuk rg = new HalamanMasuk();
            rg.setVisible(true);
            rg.pack();
            rg.setLocationRelativeTo(null);
            rg.setDefaultCloseOperation(HalamanMasuk.EXIT_ON_CLOSE);
        }
    
        private static Connection MySQLConfig;
        
        public static Connection configDB() throws SQLException {
            try {
                String url = "jdbc:mysql://localhost:3306/museum";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                MySQLConfig = DriverManager.getConnection(url,user,pass);
            }catch(SQLException e) {
                System.out.println("Koneksi Ke Database Gagal " + e.getMessage());
            }
            
            return MySQLConfig;
        }
}
