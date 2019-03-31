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
	        String sql = "insert into cartao " +
	                "(nmr_cartao,data_validade,titular,cod_seguranca)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?,?,?)";

	        try {
	            // prepared statement para inserção
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            stmt.setString(1,cartao.getNmr_cartao());
	            stmt.setDate(2, cartao.getData_validade());
	            stmt.setString(3, cartao.getTitular());
	            stmt.setString(4,cartao.getCod_seguranca());
	           
	            

	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    

}
