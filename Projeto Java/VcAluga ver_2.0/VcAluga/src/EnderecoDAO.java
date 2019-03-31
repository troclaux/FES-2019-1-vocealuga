import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDAO {
	//abre conexao com o banco de dados
		private Connection connection;

	    public EnderecoDAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }
	    public void adiciona(Endereco endereco) {
	        String sql = "insert into endereco " +
	                "(ender_completo,cep,bairro,cidade,estado)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?,?,?,?)";
	        		//id_end nao entra pois é AUTO_INCREMENT, já é gerado automaticamente após inserção

	        try {
	            // prepared statement para inserção
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            stmt.setString(1,endereco.getEnder_completo());
	            stmt.setString(2,endereco.getCep());	      
	            stmt.setString(3,endereco.getBairro());
	            stmt.setString(4,endereco.getCidade());
	            stmt.setString(5,endereco.getEstado());
	           
	            

	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    
	    

}
