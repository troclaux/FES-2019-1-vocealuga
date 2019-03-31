import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/VcAluga", "fam1709","17091991");
            					//localhost/Nome_Do_Database coloquei como VcAluga mesmo
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
