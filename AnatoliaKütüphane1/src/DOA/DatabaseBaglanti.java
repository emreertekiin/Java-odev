package DOA;





/**
 *
 * @author Onur Akbal-Emre Ertekin
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseBaglanti {
    public static Connection Baglanti(){
        try {
            
            Class.forName("org.sqlite.JDBC");
            Connection baglan = DriverManager.getConnection("jdbc:sqlite:c:\\Kutuphane\\kutuphane.sqlite"); 
            return baglan;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }  
    }
}
