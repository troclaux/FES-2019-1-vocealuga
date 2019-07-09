package control;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

public class Cartao implements metodosGenericosDAO{
	private String nmr_cartao;
	private String cod_seguranca;
	private Date data_validade;
	private String titular;
	
	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();
	
	public Cartao(String nmr_cartao, Date data_validade, String titular, String cod_seguranca) {
		this.nmr_cartao = nmr_cartao;
		this.cod_seguranca = cod_seguranca;
		this.data_validade = data_validade;
		this.titular = titular;
		
		this.dados.add(nmr_cartao);
		this.dados.add(data_validade);
		this.dados.add(titular);
		this.dados.add(cod_seguranca);
		
		this.ordemDados.add("nmr_cartao");
		this.ordemDados.add("data_validade");
		this.ordemDados.add("titular");
		this.ordemDados.add("cod_seguranca");
		
	}
	public String getNmr_cartao() {
		return nmr_cartao;
	}
	@Override
	public String consultaNomeClasse() {
		return "cartao";
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
			stmt.setString(1,this.nmr_cartao);
            stmt.setDate(2, this.data_validade);
            stmt.setString(3, this.titular);
            stmt.setString(4, this.cod_seguranca);
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }		
	}
	
	

}
