import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HabilitacaoDAO {
	//abre conexao com o banco de dados
	private Connection connection;

    public HabilitacaoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Habilitacao habilitacao) {
        String sql = "insert into Habilitacao " +
                "(NmrHabilitacao,Tipo,Categoria,Cpf_cliente,DataExped,DataVencimento)"+ //Nome tem que ser igual como ta no banco de dados
                " values (?,?,?,?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,habilitacao.getNumeroHabilitacao());
            stmt.setString(2,habilitacao.getTipo());
            stmt.setString(3,habilitacao.getCategoria());
            stmt.setString(4,habilitacao.getCpfCliente());
            stmt.setDate(5, habilitacao.getDataExpedicao());
            stmt.setDate(6, habilitacao.getDataVencimento());
            

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        	}
    	}
    
    

}


