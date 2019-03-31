import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
	
	//abre conexao com o banco de dados
	private Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Cliente cliente) {
        String sql = "insert into cliente " +
                "(cpf,datanasc,telefone,nome)" +
                " values (?,?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,cliente.getCpf());
            stmt.setDate(2, cliente.getDataNascimento());
            stmt.setString(3,cliente.getTelefone());
            stmt.setString(4,cliente.getNome());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        	}
    	}
    
    

}
