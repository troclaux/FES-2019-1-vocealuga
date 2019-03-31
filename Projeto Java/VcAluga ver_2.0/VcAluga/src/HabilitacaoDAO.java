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
        String sql = "insert into habilitacao " +
                "(nmr_registro,tipo,categoria,cpf_cliente,data_exped,data_validade)"+ //Nome tem que ser igual como ta no banco de dados
                " values (?,?,?,?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,habilitacao.getNmr_registro());
            stmt.setString(2,habilitacao.getTipo());
            stmt.setString(3,habilitacao.getCategoria());
            stmt.setString(4,habilitacao.getCpf_cliente());
            stmt.setDate(5, habilitacao.getData_exped());
            stmt.setDate(6, habilitacao.getData_validade());
            

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        	}
    	}
    
    

}


