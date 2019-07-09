package control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

public class Cartao_Cliente implements metodosGenericosDAO{
	private String Cpf_Cliente;// foreign key
	private String Nmr_Cartao_Cliente;// foreign key
	
	
	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();
	
	public Cartao_Cliente(String Cpf_Cliente, String Nmr_Cartao_Cliente) {
		this.Cpf_Cliente = Cpf_Cliente;
		this.Nmr_Cartao_Cliente = Nmr_Cartao_Cliente;
		
		this.dados.add(Cpf_Cliente);
		this.dados.add(Nmr_Cartao_Cliente);
		
		this.ordemDados.add("fk_cliente_cpf");
		this.ordemDados.add("fk_cartao_nmr_cartao");
		
		
	}
	
	@Override
	public String consultaNomeClasse() {
		return "cartao_cliente";
	}
	@Override
	public ArrayList<Object> consultaDados() {
		return this.dados;
	}
	@Override
	public ArrayList<String> consultaOrdemDados() {
		return this.ordemDados;
	}
	@Override
	public void setStatement(PreparedStatement stmt) {
		try {
			stmt.setString(1,this.Cpf_Cliente);
            stmt.setString(2,this.Nmr_Cartao_Cliente);
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }		
	}

	
}
