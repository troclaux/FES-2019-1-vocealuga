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
	        String sql = "insert into Endereco " +
	                "(Nome,Numero,Cep,Bairro,Cidade,Estado,Logradouro)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?,?,?,?,?,?)";
	        		//id_end nao entra pois é AUTO_INCREMENT, já é gerado automaticamente após inserção

	        try {
	            // prepared statement para inserção
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            stmt.setString(1,endereco.getNome());
	            stmt.setString(2,endereco.getNumero());
	            stmt.setString(3,endereco.getCep());
	            stmt.setString(4,endereco.getBairro());
	            stmt.setString(5,endereco.getCidade());
	            stmt.setString(6,endereco.getEstado());
	            stmt.setString(7,endereco.getLogradouro());
	            

	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    
	    

}
