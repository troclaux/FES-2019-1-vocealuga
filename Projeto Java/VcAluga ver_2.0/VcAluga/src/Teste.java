import java.sql.Connection;
import java.sql.SQLException;


public class Teste {

	public static void main(String[] args) throws SQLException {
	  Connection connection = new ConnectionFactory().getConnection();
          System.out.println("Conex�o realizada com sucesso!");
          connection.close();
	}
}
