import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Endereco_Cliente_DAO {
	//abre conexao com o banco de dados
		private Connection connection;

	    public Endereco_Cliente_DAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }
	    public void adiciona(Endereco_Cliente endcli) {
	    	
	    	String sql1 = "select id_ender from endereco"; //executar uma selecao para pegar o id de endereco
	               
	    	
	        String sql2 = "insert into endereco_cliente" +
	                "(fk_endereco_id_ender,fk_cliente_cpf)"+ //Nome tem que ser igual como ta no banco de dados
	                " values (?,?)";
	        		
	        
	        try {
	            // prepared statement para inserção
	        	PreparedStatement stmt1 = connection.prepareStatement(sql1); //primeiro cod. sql a ser executado
	            PreparedStatement stmt2 = connection.prepareStatement(sql2); //segundo cod. sql a ser executado
	            
	            ResultSet rs = stmt1.executeQuery();//realiza uma selecao
	            
	            while (rs.next()) {
	            	endcli.setId_Endereco_Cliente(rs.getInt("id_ender"));//iguala os id's das tabelas Endereco e Endereco_Cliente 
	            }
	            // seta os valores
	            
	            
	            stmt2.setInt(1,endcli.getId_Endereco_Cliente());
	            stmt2.setString(2,endcli.getCpf_Cliente());
	           
	            // executa
	            
	            stmt1.close();
	            rs.close();
	            stmt2.execute();
	            stmt2.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        	}
	    	}
	    
	    
}
