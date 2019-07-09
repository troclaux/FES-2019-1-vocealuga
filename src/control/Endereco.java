package control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

public class Endereco implements metodosGenericosDAO{
	private String ender_completo;
	private String cep;
	private String bairro;
	//nota: o endereço não está sendo passado nem gerado em nenhum momento
	private int id_end; //identificador é AUTO_INCREMENT 
	private String cidade;
	private String estado;
	
	
	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();
	
	public Endereco(String ender_completo, String cep, String bairro, String cidade, String estado) {
		this.ender_completo = ender_completo;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
		this.dados.add(ender_completo);
		this.dados.add(cep);
		this.dados.add(bairro);
		this.dados.add(cidade);
		this.dados.add(estado);
		
		this.ordemDados.add("ender_completo");
		this.ordemDados.add("cep");
		this.ordemDados.add("bairro");
		this.ordemDados.add("cidade");
		this.ordemDados.add("estado");
		
	}
	
	@Override
	public String consultaNomeClasse() {
		return "endereco";
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
			stmt.setString(1,this.ender_completo);
            stmt.setString(2,this.cep);	      
            stmt.setString(3,this.bairro);
            stmt.setString(4,this.cidade);
            stmt.setString(5,this.estado);
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }		
	}

	
	

}
