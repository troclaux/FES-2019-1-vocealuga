import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cartao_Cliente_DAO {
	//abre conexao com o banco de dados
		private Connection connection;

	    public Cartao_Cliente_DAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }
	    
	    public void adiciona(Cartao_Cliente cartcli) {
	        String sql = "insert into cartao_cliente " +
	                "(fk_cliente_cpf,fk_cartao_nmr_cartao)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?)";
	        try {
	            // prepared statement para inserção
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            stmt.setString(1,cartcli.getCpf_Cliente());
	            stmt.setString(2,cartcli.getNmr_Cartao_Cliente());

	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    }

