import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import java.sql.Date;

public class Tela_CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField num_cartaoField;
	private JPanel panel_cliente;
	private JPanel panel_cartao;
	private JPanel panel_habilitacao; //panel de habilitacao
	private JTextField titularField;
	private JTextField validadeField;
	private JTextField codField;
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField telefoneField;
	private JLabel lblDadosDoCarto;
	private JLabel lblCep;
	private JTextField cepField;
	private JTextField ruaField;
	private JLabel lblRua;
	private JLabel lblCompl;
	private JLabel lblBairro;
	private JLabel lblN;
	private JTextField numeroField;
	private JTextField complField;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JTextField bairroField;
	private JTextField cidadeField;
	private JTextField estadoField;
	private JLabel lblDadosPessoais;
	private JLabel lblEndereo;
	private JLabel lblHabilitacao;
	private JTextField cnhvalidadeField;
	private JTextField registro_cnhField;
	private JTextField tipocnhField;
	private JTextField categoriaField;
	private JTextField cnhexpedicaoField;
	private JTextField dataNascimentoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_CadastroCliente frame = new Tela_CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmero = new JLabel("Numero do Cartao");
		lblNmero.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblNmero.setBounds(12, 275, 111, 15);
		contentPane.add(lblNmero);
		
		JLabel lblValidade = new JLabel("Validade");
		lblValidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblValidade.setBounds(12, 317, 66, 15);
		contentPane.add(lblValidade);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblTitular.setBounds(12, 297, 66, 15);
		contentPane.add(lblTitular);
		
		JLabel lblCodSeg = new JLabel("Cod. ");
		lblCodSeg.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCodSeg.setBounds(12, 337, 90, 15);
		contentPane.add(lblCodSeg);
		
		JPanel panel = new JPanel(); //panel_endereco
		panel.setToolTipText("sd");
		panel.setBounds(554, 13, 198, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCep.setBounds(6, 39, 66, 15);
		panel.add(lblCep);
		
		cepField = new JTextField();
		cepField.setColumns(10);
		cepField.setBounds(55, 36, 49, 17);
		panel.add(cepField);
		
		ruaField = new JTextField();
		ruaField.setColumns(10);
		ruaField.setBounds(55, 55, 77, 17);
		panel.add(ruaField);
		
		lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblRua.setBounds(6, 58, 66, 15);
		panel.add(lblRua);
		
		lblCompl = new JLabel("Compl.");
		lblCompl.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCompl.setBounds(6, 77, 66, 15);
		panel.add(lblCompl);
		
		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblBairro.setBounds(6, 96, 66, 15);
		panel.add(lblBairro);
		
		lblN = new JLabel("N.");
		lblN.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblN.setBounds(135, 58, 66, 15);
		panel.add(lblN);
		
		numeroField = new JTextField();
		numeroField.setColumns(10);
		numeroField.setBounds(153, 56, 32, 17);
		panel.add(numeroField);
		
		complField = new JTextField();
		complField.setColumns(10);
		complField.setBounds(55, 74, 130, 17);
		panel.add(complField);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCidade.setBounds(6, 115, 66, 15);
		panel.add(lblCidade);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblEstado.setBounds(6, 134, 66, 15);
		panel.add(lblEstado);
		
		bairroField = new JTextField();
		bairroField.setColumns(10);
		bairroField.setBounds(55, 93, 130, 17);
		panel.add(bairroField);
		
		cidadeField = new JTextField();
		cidadeField.setColumns(10);
		cidadeField.setBounds(55, 112, 130, 17);
		panel.add(cidadeField);
		
		estadoField = new JTextField();
		estadoField.setColumns(10);
		estadoField.setBounds(55, 131, 130, 17);
		panel.add(estadoField);
		
		lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblEndereo.setBounds(7, 7, 124, 16);
		panel.add(lblEndereo);
		
		panel_cliente = new JPanel();
		panel_cliente.setToolTipText("sd");
		panel_cliente.setBounds(112, 13, 212, 115);
		contentPane.add(panel_cliente);
		panel_cliente.setLayout(null);
		
		nomeField = new JTextField();
		nomeField.setColumns(10);
		nomeField.setBounds(65, 32, 124, 17);
		panel_cliente.add(nomeField);
		
		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(65, 51, 93, 17);
		panel_cliente.add(cpfField);
		
		dataNascimentoField = new JTextField();
		dataNascimentoField.setColumns(10);
		dataNascimentoField.setBounds(125, 70, 80, 17);
		panel_cliente.add(dataNascimentoField);
		
		telefoneField = new JTextField();
		telefoneField.setColumns(10);
		telefoneField.setBounds(65, 89, 93, 17);
		panel_cliente.add(telefoneField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(0, 35, 66, 15);
		panel_cliente.add(lblNome);
		lblNome.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(0, 54, 66, 15);
		panel_cliente.add(lblCpf);
		lblCpf.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setBounds(0, 73, 156, 15);
		panel_cliente.add(lblDataNasc);
		lblDataNasc.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setBounds(0, 92, 66, 15);
		panel_cliente.add(lblTel);
		lblTel.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosPessoais.setBounds(2, 7, 224, 16);
		panel_cliente.add(lblDadosPessoais);
		
		panel_cartao = new JPanel();
		panel_cartao.setToolTipText("sd");
		panel_cartao.setBounds(12, 239, 352, 116);
		contentPane.add(panel_cartao);
		panel_cartao.setLayout(null);
		
		num_cartaoField = new JTextField();
		num_cartaoField.setBounds(115, 36, 135, 17);
		panel_cartao.add(num_cartaoField);
		num_cartaoField.setColumns(10);
		
		titularField = new JTextField();
		titularField.setColumns(10);
		titularField.setBounds(115, 55, 124, 17);
		panel_cartao.add(titularField);
		
		validadeField = new JTextField();
		validadeField.setColumns(10);
		validadeField.setBounds(115, 74, 111, 17);
		panel_cartao.add(validadeField);
		
		codField = new JTextField();
		codField.setColumns(10);
		codField.setBounds(115, 93, 41, 17);
		panel_cartao.add(codField);
		
		lblDadosDoCarto = new JLabel("Dados do Cartão");
		lblDadosDoCarto.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosDoCarto.setBounds(1, 7, 224, 16);
		panel_cartao.add(lblDadosDoCarto);
		
		
		panel_habilitacao = new JPanel();
		panel_habilitacao.setToolTipText("sd");
		panel_habilitacao.setBounds(554, 239, 198, 170);
		contentPane.add(panel_habilitacao);
		panel_habilitacao.setLayout(null);
		
		lblHabilitacao = new JLabel("Dados Habilitação");
		lblHabilitacao.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblHabilitacao.setBounds(1, 1, 200, 16);
		panel_habilitacao.add(lblHabilitacao);
		
		JLabel lblRegistroCNH = new JLabel("Registro");
		lblRegistroCNH.setBounds(0, 36, 66, 15);
		panel_habilitacao.add(lblRegistroCNH);
		lblRegistroCNH.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		registro_cnhField = new JTextField();
		registro_cnhField.setBounds(58, 36, 112, 17);
		panel_habilitacao.add(registro_cnhField);
		registro_cnhField.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(0, 56, 66, 15);
		panel_habilitacao.add(lblTipo);
		lblTipo.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		tipocnhField = new JTextField();
		tipocnhField.setColumns(10);
		tipocnhField.setBounds(58, 55, 124, 17);
		panel_habilitacao.add(tipocnhField);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(0, 76, 66, 15);
		panel_habilitacao.add(lblCategoria);
		lblCategoria.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		categoriaField = new JTextField();
		categoriaField.setColumns(10);
		categoriaField.setBounds(58, 74, 25, 17);
		panel_habilitacao.add(categoriaField);
		
		JLabel lblValidadeCNH = new JLabel("Validade");
		lblValidadeCNH.setBounds(0, 96, 66, 15);
		panel_habilitacao.add(lblValidadeCNH);
		lblValidadeCNH.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		cnhvalidadeField = new JTextField();
		cnhvalidadeField.setColumns(10);
		cnhvalidadeField.setBounds(58, 93, 111, 17);
		panel_habilitacao.add(cnhvalidadeField);
		
		JLabel lblExpedicaoCNH = new JLabel("Expedicao");
		lblExpedicaoCNH .setBounds(0, 116, 66, 15);
		panel_habilitacao.add(lblExpedicaoCNH );
		lblExpedicaoCNH .setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		cnhexpedicaoField = new JTextField();
		cnhexpedicaoField.setColumns(10);
		cnhexpedicaoField.setBounds(58, 113, 111, 17);
		panel_habilitacao.add(cnhexpedicaoField);
		
		
		
		//acao do botao Cadastrar, pegar o que esta nos campos com getText e inserir em suas
		//respectivas tables usando as classes DAO de cada tabela
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          	//Insercao de cliente pelos campos de Dados Pessoais
		        	Cliente cliente = new Cliente();
		        	cliente.setCpf(cpfField.getText());
		        	cliente.setNome(nomeField.getText());
		        	cliente.setTelefone(telefoneField.getText());
		        	cliente.setDataNascimento(Date.valueOf(dataNascimentoField.getText()));//Date.valueOf e pra manter no formato
		        																		//de data do mysql que é yyyy-mm-dd
		        	ClienteDAO cliDao = new ClienteDAO();
		        	cliDao.adiciona(cliente);
		        	
		        	//Insercao de cartao pelos campos de Dados do Cartao
		        	
		        	Cartao cartao = new Cartao();
		        	cartao.setNmr_cartao(num_cartaoField.getText());
		        	cartao.setData_validade(Date.valueOf(validadeField.getText()));
		        	cartao.setTitular(titularField.getText());
		        	cartao.setCod_seguranca(codField.getText());
		        	
		        	CartaoDAO cartDao = new CartaoDAO();
		        	cartDao.adiciona(cartao);
		        	
		        	//Insercao de habilitacao pelos campos de Dados Habilitacao
		        	
		        	Habilitacao habilitacao = new Habilitacao();
		        	habilitacao.setNmr_registro(registro_cnhField.getText());
		        	habilitacao.setTipo(tipocnhField.getText());
		        	habilitacao.setCategoria(categoriaField.getText());
		        	habilitacao.setData_validade(Date.valueOf(cnhvalidadeField.getText()));
		        	habilitacao.setData_exped(Date.valueOf(cnhexpedicaoField.getText()));
		        	habilitacao.setCpf_cliente(cliente.getCpf());
		        	
		        	HabilitacaoDAO habiDao = new HabilitacaoDAO();
		        	habiDao.adiciona(habilitacao);
		        	
		        	//Insercao de endereco pelos campos de Endereço
		        	
		        	Endereco ender = new Endereco();
		        	ender.setEnder_completo(ruaField.getText() + " " +  numeroField.getText() + " "+ complField.getText());
		        	ender.setCep(cepField.getText());
		        	ender.setBairro(bairroField.getText());
		        	ender.setCidade(cidadeField.getText());
		        	ender.setEstado(estadoField.getText());
		        	
		        	EnderecoDAO endDao = new EnderecoDAO();
		        	endDao.adiciona(ender);
		        	
		        	//Insercao das tabelas Endereco_cliente e Cartao_cliente possuem foreign keys
		        	
		        	Cartao_Cliente cartcli = new Cartao_Cliente();
		        	cartcli.setCpf_Cliente(cliente.getCpf());
		        	cartcli.setNmr_Cartao_Cliente(cartao.getNmr_cartao());
		        	
		        	Endereco_Cliente endcli = new Endereco_Cliente();
		        	endcli.setCpf_Cliente(cliente.getCpf());
		        	
		        	Cartao_Cliente_DAO cart_cliDao = new Cartao_Cliente_DAO();
		        	cart_cliDao.adiciona(cartcli);
		        	
		        	Endereco_Cliente_DAO end_cliDao = new Endereco_Cliente_DAO();
		        	end_cliDao.adiciona(endcli);
		        	
		        	
		        	
		        	
		        	
		        	//JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
		        	
		        	
					
				
			}
		});
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCadastrar.setBounds(229, 500, 93, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnVoltar.setBounds(400, 500, 93, 25);
		contentPane.add(btnVoltar);
	}
}
