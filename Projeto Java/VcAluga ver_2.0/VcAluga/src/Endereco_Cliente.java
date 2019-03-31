
public class Endereco_Cliente {
	private int Id_Endereco_Cliente;// foreign key 
	private String Cpf_Cliente;// foreign key
	
	

	public String getCpf_Cliente() {
		return Cpf_Cliente;
	}

	public void setCpf_Cliente(String cpf_Cliente) {
		Cpf_Cliente = cpf_Cliente;
	}

	public int getId_Endereco_Cliente() {
		return Id_Endereco_Cliente;
	}

	public void setId_Endereco_Cliente(int id_Endereco_Cliente) {
		Id_Endereco_Cliente = id_Endereco_Cliente;
	}
	
	

}
