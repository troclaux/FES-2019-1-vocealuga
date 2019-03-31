import java.sql.Date;

public class Habilitacao {
	private String nmr_registro;
	private String tipo; //provisoria ou definitiva
	private String categoria;
	private String cpf_cliente; // foreign key
	private Date data_exped;
	private Date data_validade;
	
	public String getNmr_registro() {
		return nmr_registro;
	}
	public void setNmr_registro(String nmr_registro) {
		this.nmr_registro = nmr_registro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	public Date getData_exped() {
		return data_exped;
	}
	public void setData_exped(Date data_exped) {
		this.data_exped = data_exped;
	}
	public Date getData_validade() {
		return data_validade;
	}
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}
	
	
	
	
}
