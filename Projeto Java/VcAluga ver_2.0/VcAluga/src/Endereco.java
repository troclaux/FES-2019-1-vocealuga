

public class Endereco {
	private String ender_completo;
	private String cep;
	private String bairro;
	private int id_end; //identificador é AUTO_INCREMENT 
	private String cidade;
	private String estado;
	
	public String getEnder_completo() {
		return ender_completo;
	}
	public void setEnder_completo(String ender_completo) {
		this.ender_completo = ender_completo;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getId_end() {
		return id_end;
	}
	public void setId_end(int id_end) {
		this.id_end = id_end;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	} 

	
	

}
