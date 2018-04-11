import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi_mysql {
    Connection koneksi;
    public Connection getConnection(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/resto","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi;
    }
}
