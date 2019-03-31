import java.sql.Date;

public class Cartao {
	private String nmr_cartao;
	private String cod_seguranca;
	private Date data_validade;
	private String titular;
	
	public String getNmr_cartao() {
		return nmr_cartao;
	}
	public void setNmr_cartao(String nmr_cartao) {
		this.nmr_cartao = nmr_cartao;
	}
	public String getCod_seguranca() {
		return cod_seguranca;
	}
	public void setCod_seguranca(String cod_seguranca) {
		this.cod_seguranca = cod_seguranca;
	}
	public Date getData_validade() {
		return data_validade;
	}
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
