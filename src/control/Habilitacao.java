package control;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

public class Habilitacao implements metodosGenericosDAO{
	private String nmr_registro;
	private String tipo; //provisoria ou definitiva
	private String categoria;
	private String cpf_cliente; // foreign key
	private Date data_exped;
	private Date data_validade;
	
	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();
	
	public Habilitacao(String nmr_registro, String tipo, String categoria, Date data_validade, Date data_exped, String cpf_cliente) {
		this.nmr_registro = nmr_registro;
		this.tipo = tipo;
		this.categoria = categoria;
		this.data_validade = data_validade;
		this.data_exped = data_exped;
		this.cpf_cliente = cpf_cliente;
		
		this.dados.add(nmr_registro);
		this.dados.add(tipo);
		this.dados.add(categoria);
		this.dados.add(cpf_cliente);
		this.dados.add(data_exped);
		this.dados.add(data_validade);
		
		this.ordemDados.add("nmr_registro");
		this.ordemDados.add("tipo");
		this.ordemDados.add("categoria");
		this.ordemDados.add("cpf_cliente");
		this.ordemDados.add("data_exped");
		this.ordemDados.add("data_validade");

	}
	@Override
	public String consultaNomeClasse() {
		return "habilitacao";
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
            stmt.setString(1,this.nmr_registro);
            stmt.setString(2,this.tipo);
            stmt.setString(3,this.categoria);
            stmt.setString(4,this.cpf_cliente);
            stmt.setDate(5, this.data_exped);
            stmt.setDate(6, this.data_validade);
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }		
	}
}