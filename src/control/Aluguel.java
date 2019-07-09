package control;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

import java.sql.ResultSet;


public class Aluguel implements metodosGenericosDAO {

	// qual seria o identificador de um aluguel?
	private Date dataInicial;
	private Date dataFinal;
	private float valorLocacao;
	private String cliente;
	private String veiculo;
	private int idAluguel;


	private ArrayList<Object> dadosAluguel = new ArrayList<Object>();
	private ArrayList<String> ordemDadosAluguel = new ArrayList<String>();


	public Aluguel( Date dataInicial, Date dataFinal, float valorLocacao, String cliente, String veiculo,
			int idAluguel/*, boolean usarPontos */) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.valorLocacao = valorLocacao;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.idAluguel = idAluguel;

		this.dadosAluguel.add( dataInicial );
		this.dadosAluguel.add( dataFinal );
		this.dadosAluguel.add( valorLocacao );
		this.dadosAluguel.add( cliente );
		this.dadosAluguel.add( veiculo );
		this.dadosAluguel.add( idAluguel );

		this.ordemDadosAluguel.add( "dataInicial" );
		this.ordemDadosAluguel.add( "dataFinal" );
		this.ordemDadosAluguel.add( "valorLocacao" );
		this.ordemDadosAluguel.add( "cliente" );
		this.ordemDadosAluguel.add( "veiculo" );
		this.ordemDadosAluguel.add( "idAluguel" );
		
		/*if(usarPontos) {
			processarDesconto();
		}
		
		atualizaCreditosCliente();
	}


	void calcularImpostosLocais() {
		// TODO
	}

	// funcao que checa se o veiculo esta com manutençoes em dia, se o cliente tem
	// carteira de motorista validade, se o aluguel tem dataFinal antes de um outro
	// aluguel do veiculo
	void ChecaRequisitosMinimos() {
		// TODO
	}

	// atualiza valorLocacao de acordo com os pontos do cliente
	// 1000 pts = 1% desconto 
	public void processarDesconto() {
		int pontos = 0, desconto = 0;
		Connection connection = new ConnectionFactory().getConnection();
		
		String sql = "select creditos from cliente where cpf = ?";
		
		// calcular desconto
		try {
			PreparedStatement statement = connection.prepareStatement( sql );
			statement.setString(1, cliente);
			
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			pontos = resultSet.getInt(1);
			
			if (pontos < 100000) {
				desconto = pontos / 1000;
				pontos = 0;
			} else {
				desconto = 100;
				pontos -= 100000;
			}
			
			valorLocacao -= valorLocacao * desconto/100;
			
			statement.close();
		} catch( SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sql = "update cliente "
				+ "set creditos = ? "
				+ "where cpf = ?";
		
		// atualizar pontos do cliente
		try {
			PreparedStatement statement = connection.prepareStatement( sql );
			statement.setInt(1, pontos);
			statement.setString(2, cliente);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
		} catch( SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// cada dia é 13 pontos
	public void atualizaCreditosCliente() {
		int pontos = 0;
		Connection connection = new ConnectionFactory().getConnection();
		
		long dias = (dataFinal.getTime() - dataInicial.getTime()) / (1000*60*60*24);
		
		
		String sql = "select creditos "
				+ "from cliente "
				+ "where cpf = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement( sql );
			statement.setString(1, cliente);
			
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			pontos = resultSet.getInt(1);
			
			statement.close();
		} catch( SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pontos += dias * 13;
		
		sql = "update cliente "
				+ "set creditos = ? "
				+ "where cpf = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement( sql );
			statement.setInt(1, pontos);
			statement.setString(2, cliente);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
		} catch( SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	@Override
	public String consultaNomeClasse() {
		return "aluguel";
	}

	// TODO
	@Override
	public ArrayList<Object> consultaDados() {
		return this.dadosAluguel;
	}

	@Override
	public ArrayList<String> consultaOrdemDados() {
		return this.ordemDadosAluguel;
	}

	@Override
	public void setStatement( PreparedStatement stmt ) {
		try {
			stmt.setDate( 1, this.dataInicial );
			stmt.setDate( 2, this.dataFinal );
			stmt.setFloat( 3, this.valorLocacao );
			stmt.setString( 4, this.cliente );
			stmt.setString( 5, this.veiculo );
			stmt.setInt( 6, this.idAluguel );
		} catch( SQLException e ) {
			throw new RuntimeException( e );
		}
	}
}
