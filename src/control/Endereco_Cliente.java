package control;
import java.util.ArrayList;

public class Endereco_Cliente {
	private int Id_Endereco_Cliente;// foreign key 
	private String Cpf_Cliente;// foreign key
	
	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();

	public Endereco_Cliente(String Cpf_Cliente) {
		this.Cpf_Cliente = Cpf_Cliente;
		
		this.dados.add(Cpf_Cliente);
		
		this.ordemDados.add("fk_cliente_cpf");
	}

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
