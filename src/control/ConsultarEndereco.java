package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.ConnectionFactory;
import view.Tela_CadastroCliente;


public class ConsultarEndereco extends javax.swing.JInternalFrame {

	private static final long serialVeresultSetionUID = 1L;

	private JDesktopPane jdpPrincipal;
	
	private javax.swing.JButton btExcluir;
	private javax.swing.JButton btNovo;
	private javax.swing.JButton btPesquisar;
	private javax.swing.JButton btAlterar;
	private javax.swing.JButton btCancelar;
	private javax.swing.JButton btAtualizar;
	private javax.swing.JLabel jLabel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jtEndereco;
	private javax.swing.JTextField txtNome;

	public ConsultarEndereco( JDesktopPane jdp ) {
		initComponents();
		jdpPrincipal = jdp;
		try {
			Connection connection = new ConnectionFactory().getConnection();
			String sql = "select endereco.*,endereco_cliente.fk_cliente_cpf from endereco inner join endereco_cliente on endereco.id_ender = endereco_cliente.fk_endereco_id_ender ";
			// if(!txtNome.getText().equals(""))
			// sql = sql + " where Nome LIKE ? ";
			PreparedStatement statement = connection.prepareStatement( sql );
			if( !txtNome.getText().equals( "" ) )
				statement.setString( 1, "%" + txtNome.getText() + "%" );
			ResultSet resultSet = statement.executeQuery();
			DefaultTableModel model = ( DefaultTableModel ) jtEndereco.getModel();
			model.setNumRows( 0 );
			while( resultSet.next() ) {
				String[] linha = { resultSet.getString( "fk_cliente_cpf" ), resultSet.getString( "ender_completo" ), resultSet.getString( "bairro" ),
						resultSet.getString( "cidade" ),resultSet.getString( "estado" ),resultSet.getString( "cep" ) };
				model.addRow( linha );
			}

			statement.close();
			connection.close();
		} catch( SQLException e ) {
			JOptionPane.showMessageDialog( this, e );
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings( { "unchecked", "serial" } )

	private void initComponents() {

		jLabel = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		btPesquisar = new javax.swing.JButton();
		btNovo = new javax.swing.JButton();
		btAlterar = new javax.swing.JButton();
		btExcluir = new javax.swing.JButton();
		btCancelar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jtEndereco = new javax.swing.JTable();
		btAtualizar = new javax.swing.JButton();

		setClosable( true );
		setIconifiable( true );
		setMaximizable( true );
		setResizable( true );
		setTitle( "Consultar Endereço" );

		jLabel.setText( "CPF:" );

		txtNome.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btNomeActionPerformed( evt );
			}
		} );

		btPesquisar.setText( "Pesquisar" );
		btPesquisar.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btPesquisarActionPerformed( evt );
			}
		} );

		btNovo.setText( "Novo" );
		btNovo.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btNovoActionPerformed( evt );
			}
		} );

		btAlterar.setText( "Alterar" );
		btAlterar.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btAlterarActionPerformed( evt );
			}
		} );

		/*btExcluir.setText( "Excluir" );
		btExcluir.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btExcluirActionPerformed( evt );
			}
		} );*/

		btCancelar.setText( "Cancelar" );
		btCancelar.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				btCancelarActionPerformed( evt );
			}
		} );

		jtEndereco.setModel( new javax.swing.table.DefaultTableModel( new Object[][] {

		}, new String[] { "CPF", "Endereço Completo", "Bairro", "Cidade","Estado","CEP" } ) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false,false};

			public boolean isCellEditable( int rowIndex, int columnIndex ) {
				return canEdit[columnIndex];
			}
		} );
		jScrollPane1.setViewportView( jtEndereco );

		btAtualizar.setText( "Atualizar" );
		btAtualizar.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				jButtonAtualizarActionPerformed( evt );
			}
		} );

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
		getContentPane().setLayout( layout );
		layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
				.addGroup( layout.createSequentialGroup().addContainerGap()
						.addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
								.addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE )
								.addGroup( layout.createSequentialGroup().addComponent( btPesquisar )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( btNovo )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( btAlterar )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( btExcluir )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( btAtualizar )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( btCancelar )
										.addGap( 0, 0, Short.MAX_VALUE ) )
								.addGroup( layout.createSequentialGroup().addComponent( jLabel )
										.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( txtNome ) ) )
						.addContainerGap() ) );
		layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
				.addGroup( layout.createSequentialGroup().addContainerGap()
						.addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
								.addComponent( txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE )
								.addComponent( jLabel ) )
						.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
						.addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( btPesquisar )
								.addComponent( btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE )
								.addComponent( btAlterar ).addComponent( btExcluir ).addComponent( btCancelar ).addComponent( btAtualizar ) )
						.addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE )
						.addContainerGap() ) );

		pack();
	}

	private void btNomeActionPerformed( java.awt.event.ActionEvent evt ) {
	
	}

	private void btCancelarActionPerformed( java.awt.event.ActionEvent evt ) {

	}

	private void btNovoActionPerformed( java.awt.event.ActionEvent evt ) {
		Tela_CadastroCliente cadastrarCliente = new Tela_CadastroCliente();
		jdpPrincipal.add( cadastrarCliente );
		cadastrarCliente.setVisible( true );
	}

	private void btPesquisarActionPerformed( java.awt.event.ActionEvent evt ) {
		
		try {
			Connection connection = new ConnectionFactory().getConnection();
			String sql = "select endereco.*,endereco_cliente.fk_cliente_cpf from endereco inner join endereco_cliente on endereco.id_ender = endereco_cliente.fk_endereco_id_ender ";
			if( !txtNome.getText().equals( "" ) )
				sql = sql + " where fk_cliente_cpf LIKE ? ";
			PreparedStatement statement = connection.prepareStatement( sql );
			if( !txtNome.getText().equals( "" ) )
				statement.setString( 1, "%" + txtNome.getText() + "%" );
			ResultSet resultSet = statement.executeQuery();
			DefaultTableModel model = ( DefaultTableModel ) jtEndereco.getModel();
			model.setNumRows( 0 );
			while( resultSet.next() ) {
				String[] linha = { resultSet.getString( "fk_cliente_cpf" ), resultSet.getString( "ender_completo" ), resultSet.getString( "bairro" ),
						resultSet.getString( "cidade" ),resultSet.getString( "estado" ),resultSet.getString( "cep" ) };
				model.addRow( linha );
			}

			statement.close();
			connection.close();
		} catch( SQLException e ) {
			JOptionPane.showMessageDialog( this, e );
		}

	}
/*
	private void btExcluirActionPerformed( java.awt.event.ActionEvent evt ) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			String sql = "delete from cartao inner join cartao_cliente on cartao.nmr_cartao = cartao_cliente.fk_cartao_nmr_cartao ";
			PreparedStatement statement = connection.prepareStatement( sql );
			int linha = this.jtEndereco.getSelectedRow();
			statement.setString( 1, jtEndereco.getValueAt( linha, 0 ).toString() );
			statement.execute();
			statement.close();
			connection.close();
			DefaultTableModel model = ( DefaultTableModel ) jtEndereco.getModel();
			model.removeRow( linha );
			JOptionPane.showMessageDialog( this, "Cliente Excluído com Sucesso!" );
			this.setClosable( true );
		} catch( SQLException e ) {
			JOptionPane.showMessageDialog( this, e );
		}
	}

*/

	private void btAlterarActionPerformed( java.awt.event.ActionEvent evt ) {
		int linha = this.jtEndereco.getSelectedRow();
		int id = Integer.parseInt( jtEndereco.getValueAt( linha, 0 ).toString() );
		Tela_CadastroCliente cadastrarCliente = new Tela_CadastroCliente();
		jdpPrincipal.add( cadastrarCliente );
		cadastrarCliente.setVisible( true );
	}

	private void jButtonAtualizarActionPerformed( java.awt.event.ActionEvent evt ) {
		try {
			Connection con = new ConnectionFactory().getConnection();
			String sql = "select endereco.*,endereco_cliente.fk_cliente_cpf from endereco inner join endereco_cliente on endereco.id_ender = endereco_cliente.fk_endereco_id_ender ";
			// if(!txtNome.getText().equals(""))
			// sql = sql + " where Nome LIKE ? ";
			PreparedStatement statement = con.prepareStatement( sql );
			if( !txtNome.getText().equals( "" ) )
				statement.setString( 1, "%" + txtNome.getText() + "%" );
			ResultSet resultSet = statement.executeQuery();
			DefaultTableModel model = ( DefaultTableModel ) jtEndereco.getModel();
			model.setNumRows( 0 );
			while( resultSet.next() ) {
				String[] linha = { resultSet.getString( "fk_cliente_cpf" ), resultSet.getString( "ender_completo" ), resultSet.getString( "bairro" ),
						resultSet.getString( "cidade" ),resultSet.getString( "estado" ),resultSet.getString( "cep" ) };
				model.addRow( linha );
			}

			statement.close();
			con.close();
		} catch( SQLException e ) {
			JOptionPane.showMessageDialog( this, e );
		}
	}


}
