import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CartaoDAO {
	//abre conexao com o banco de dados
		private Connection connection;

	    public CartaoDAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }
	    
	    public void adiciona(Cartao cartao) {
	        String sql = "insert into Cartao " +
	                "(NmrCartao,Tipo,Validade,Titular)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?,?,?)";

	        try {
	            // prepared statement para inserção
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            stmt.setString(1,cartao.getNumeroCartao());
	            stmt.setString(2,cartao.getTipo());
	            stmt.setDate(3,cartao.getDataValidade());
	            stmt.setString(4,cartao.getTitular());
	           
	            

	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    

}
