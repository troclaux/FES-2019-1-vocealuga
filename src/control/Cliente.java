package control;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.metodosGenericosDAO;

public class Cliente implements metodosGenericosDAO {
	private String cpf;
	private Date dataNascimento;
	private String telefone;
	private String nome;
	private int creditos;

	private ArrayList<Object> dados = new ArrayList<Object>();
	private ArrayList<String> ordemDados = new ArrayList<String>();


	public Cliente( String cpf, Date dataNascimento, String telefone, String nome/*, int creditos*/ ) {
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.nome = nome;
		//this.creditos = creditos;

		this.dados.add( cpf );
		this.dados.add( dataNascimento );
		this.dados.add( telefone );
		this.dados.add( nome );
		this.dados.add( creditos );

		this.ordemDados.add( "cpf" );
		this.ordemDados.add( "datanasc" );
		this.ordemDados.add( "telefone" );
		this.ordemDados.add( "nome" );
		//this.ordemDados.add( "creditos" );
	}

	public String getCpf() {
		return cpf;
	}

	public int getCreditos() {
		return creditos;
	}

	@Override
	public String consultaNomeClasse() {
		return "cliente";
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
	public void setStatement( PreparedStatement stmt ) {
		try {
			stmt.setString( 1, this.cpf );
			stmt.setDate( 2, this.dataNascimento );
			stmt.setString( 3, this.telefone );
			stmt.setString( 4, this.nome );
			//stmt.setInt( 5, this.creditos );
		} catch( SQLException e ) {
			throw new RuntimeException( e );
		}
	}
}
