
public class Cartao_Cliente {
	private String Cpf_Cliente;// foreign key
	private String Nmr_Cartao_Cliente;// foreign key
	
	public String getCpf_Cliente() {
		return Cpf_Cliente;
	}
	public void setCpf_Cliente(String cpf_Cliente) {
		Cpf_Cliente = cpf_Cliente;
	}
	public String getNmr_Cartao_Cliente() {
		return Nmr_Cartao_Cliente;
	}
	public void setNmr_Cartao_Cliente(String nmr_Cartao_Cliente) {
		Nmr_Cartao_Cliente = nmr_Cartao_Cliente;
	}
	
}
