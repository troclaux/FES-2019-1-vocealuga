package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAO {

	//abre conexao com o banco de dados
		private Connection connection;

	    public DAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }
	    
	    public void adiciona(metodosGenericosDAO generico) {
	    	
	    	
	        String sql = "insert into " + generico.consultaNomeClasse() + "(";
	        
	        int tamanho = generico.consultaOrdemDados().size() ;
	        String stringTemp = " values (";
	        for (int i =0; i<tamanho ; i++) {
	        	sql = sql + generico.consultaOrdemDados().get(i);
	        	stringTemp = stringTemp + "?";
	        	if (i +1 < tamanho) {
	        		sql = sql + ",";
	        		stringTemp = stringTemp + ",";
	        	}
	        }
	        sql = sql + ")";
	        stringTemp = stringTemp + ")";
	        sql = sql + stringTemp;	        

	        
	        try {
	            // prepared statement para inserÃ§Ã£o
	            PreparedStatement stmt = connection.prepareStatement(sql);

	            // seta os valores
	            generico.setStatement(stmt);
	            // executa
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	        	if(e.getMessage().contains("Duplicate"))
	        		JOptionPane.showMessageDialog( null, "Erro : Este Cliente ja foi cadastrado", "Atenção", JOptionPane.WARNING_MESSAGE );
	        
	            throw new RuntimeException(e);
	        	}
	    	}
}
