import java.sql.Date;

public class Insercao {

	public static void main(String[] args){
		Cliente cliente = new Cliente();
		Habilitacao habilitacao = new Habilitacao();
		Cartao cartao = new Cartao();
		Endereco endereco = new Endereco();
		Endereco_Cliente end_cli = new Endereco_Cliente();
		Cartao_Cliente cart_cli = new Cartao_Cliente();
		

		cliente.setCpf("11111111111");
		cliente.setTelefone("2194326130");
		cliente.setDataNascimento(Date.valueOf("1991-09-17")); //formato das datas ano-mes-dia
	    
	  
		
		habilitacao.setNumeroHabilitacao("12345678912");
		habilitacao.setTipo("provisoria");
		habilitacao.setCategoria("A");
		habilitacao.setCpfCliente(cliente.getCpf());
		habilitacao.setDataExpedicao(Date.valueOf("2015-12-08"));
		habilitacao.setDataVencimento(Date.valueOf("2020-07-09"));
		
		cartao.setNumeroCartao("123456789101112");
		cartao.setTipo("credito");
		cartao.setDataValidade(Date.valueOf("2021-10-01"));//validade do cartao geralmente formato ano/mes mas como em mysql
															//nao pode omitir o dia, coloca sempre como o primeiro dia do mes
		cartao.setTitular("JOAO JOAO JOAO");
		
		
		endereco.setNome("JOAO JOAO JOAO");
		endereco.setNumero("135");
		endereco.setCep("22020-010");
		endereco.setBairro("Hiroshima");
		endereco.setCidade("Miami");
		endereco.setEstado("Caracas");
		endereco.setLogradouro("Rua Rua");
		
		
		end_cli.setCpf_Cliente(cliente.getCpf());
		
		cart_cli.setCpf_Cliente(cliente.getCpf());
		cart_cli.setNmr_Cartao_Cliente(cartao.getNumeroCartao());
	
		ClienteDAO cliDao = new ClienteDAO();
		HabilitacaoDAO habDao = new HabilitacaoDAO();
		CartaoDAO cartDao = new CartaoDAO();
		EnderecoDAO endDao = new EnderecoDAO();
		Endereco_Cliente_DAO endcliDao = new Endereco_Cliente_DAO();
		Cartao_Cliente_DAO cartcliDao = new Cartao_Cliente_DAO();
		
		
		
		cliDao.adiciona(cliente);
		habDao.adiciona(habilitacao);
		cartDao.adiciona(cartao);
		
		endDao.adiciona(endereco);
		
		
		endcliDao.adiciona(end_cli);
		
		cartcliDao.adiciona(cart_cli);
		
		
		System.out.println("Insercao Feita!");

	}

}
