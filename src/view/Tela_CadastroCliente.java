package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import control.Cartao;
import control.Cartao_Cliente;
import control.Cliente;
import control.Endereco;
import control.Endereco_Cliente;
import control.Habilitacao;
import model.DAO;
import model.Endereco_Cliente_DAO;

public class Tela_CadastroCliente  extends javax.swing.JInternalFrame {

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
	private JLabel lblEndereco;
	private JLabel lblHabilitacao;
	private JTextField cnhvalidadeField;
	private JTextField registro_cnhField;
	private JTextField tipocnhField;
	private JTextField categoriaField;
	private JTextField cnhexpedicaoField;
	private JTextField dataNascimentoField;
	List<JTextField> campos = new ArrayList<JTextField>(); //array de campos de texto usado para
	//apagá-los após inserção

	/*
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
	*/

	/**
	 * Create the frame.
	 */
	public Tela_CadastroCliente() {
		try {
			MaskFormatter cpfFormat = new MaskFormatter("###.###.###-##");
			MaskFormatter telefoneFormat = new MaskFormatter("(##)#####-####");
			MaskFormatter cepFormat = new MaskFormatter("#####-###");
			MaskFormatter nmrCartaoFormat = new MaskFormatter("################");
			MaskFormatter codigoFormat = new MaskFormatter("###");
			MaskFormatter regCnhFormat = new MaskFormatter("###########");
			MaskFormatter datNascFormat = new MaskFormatter("##/##/####");
			MaskFormatter datValCartaoFormat = new MaskFormatter("##/##/####");
			MaskFormatter datExpCnhFormat = new MaskFormatter("##/##/####");
			MaskFormatter datValCnhFormat = new MaskFormatter("##/##/####");
		
		setTitle( "Cadastrar Cliente" );
		setClosable(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconifiable( true );
		setMaximizable( true );
		setBounds(1, 1, 909, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel(); //panel_endereco
		panel.setBounds(453, 13, 422, 223);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCep.setBounds(6, 35, 66, 15);
		panel.add(lblCep);
		
		cepField = new JFormattedTextField(cepFormat);
		cepField.setColumns(10);
		cepField.setBounds(55, 35, 255, 26);
		cepField.setToolTipText("Sem hífen ex: 22020010");
		panel.add(cepField);
		campos.add(cepField);
		
		ruaField = new JTextField();
		ruaField.setColumns(10);
		ruaField.setBounds(55, 65, 255, 26);
		panel.add(ruaField);
		campos.add(ruaField);
		
		lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblRua.setBounds(6, 65, 66, 15);
		panel.add(lblRua);
		
		lblCompl = new JLabel("Compl.");
		lblCompl.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCompl.setBounds(6, 95, 66, 15);
		panel.add(lblCompl);
		
		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblBairro.setBounds(6, 125, 66, 15);
		panel.add(lblBairro);
		
		lblN = new JLabel("Nmr");
		lblN.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblN.setBounds(328, 69, 32, 15);
		panel.add(lblN);
		
		numeroField = new JFormattedTextField();
		numeroField.setColumns(10);
		numeroField.setBounds(358, 66, 59, 26);
		panel.add(numeroField);
		campos.add(numeroField);
		
		complField = new JTextField();
		complField.setColumns(10);
		complField.setBounds(55, 95, 255, 26);
		panel.add(complField);
		campos.add(complField);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCidade.setBounds(6, 155, 66, 15);
		panel.add(lblCidade);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblEstado.setBounds(6, 185, 66, 15);
		panel.add(lblEstado);
		
		bairroField = new JTextField();
		bairroField.setColumns(10);
		bairroField.setBounds(55, 125, 255, 26);
		panel.add(bairroField);
		campos.add(bairroField);
		
		cidadeField = new JTextField();
		cidadeField.setColumns(10);
		cidadeField.setBounds(55, 155, 130, 26);
		panel.add(cidadeField);
		campos.add(cidadeField);
		
		estadoField = new JTextField();
		estadoField.setColumns(10);
		estadoField.setBounds(55, 185, 255, 26);
		panel.add(estadoField);
		campos.add(estadoField);
		
		lblEndereco = new JLabel("Endereço");
		lblEndereco.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblEndereco.setBounds(136, 0, 124, 16);
		panel.add(lblEndereco);
		
		panel_cliente = new JPanel();
		panel_cliente.setBounds(34, 13, 407, 223);
		contentPane.add(panel_cliente);
		panel_cliente.setLayout(null);
		
		nomeField = new JTextField();
		nomeField.setColumns(10);
		nomeField.setBounds(133, 35, 122, 26);
		panel_cliente.add(nomeField);
		campos.add(nomeField);
		
		cpfField = new JFormattedTextField(cpfFormat);
		cpfField.setColumns(10);
		cpfField.setBounds(133, 65, 122, 26);
		cpfField.setToolTipText("Sem separadores ex: 1234567894" );
		panel_cliente.add(cpfField);
		campos.add(cpfField);
		
		dataNascimentoField = new JFormattedTextField(datNascFormat);
		dataNascimentoField.setColumns(10);
		dataNascimentoField.setBounds(133, 95, 122, 26);
		dataNascimentoField.setToolTipText("Formato dia/mes/ano");
		panel_cliente.add(dataNascimentoField);
		campos.add(dataNascimentoField);
		
		
		telefoneField = new JFormattedTextField(telefoneFormat);
		telefoneField.setColumns(10);
		telefoneField.setBounds(133, 125, 250, 26);
		telefoneField.setToolTipText("Sem separadores ex: 993217654");
		panel_cliente.add(telefoneField);
		campos.add(telefoneField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(1, 35, 66, 15);
		panel_cliente.add(lblNome);
		lblNome.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(1, 65, 66, 15);
		panel_cliente.add(lblCpf);
		lblCpf.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setBounds(1, 95, 156, 15);
		panel_cliente.add(lblDataNasc);
		lblDataNasc.setFont(new Font("Jamrul", Font.PLAIN, 10));
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setBounds(1, 125, 66, 15);
		panel_cliente.add(lblTel);
		lblTel.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosPessoais.setBounds(114, 12, 224, 16);
		panel_cliente.add(lblDadosPessoais);
		
		panel_cartao = new JPanel();
		panel_cartao.setBounds(34, 283, 407, 182);
		contentPane.add(panel_cartao);
		panel_cartao.setLayout(null);
		
		num_cartaoField = new JFormattedTextField(nmrCartaoFormat);
		num_cartaoField.setBounds(133, 30, 250, 26);
		num_cartaoField.setToolTipText("Sem separadores ex: 1111222233334444");
		panel_cartao.add(num_cartaoField);
		campos.add(num_cartaoField);
		num_cartaoField.setColumns(10);
		
		titularField = new JTextField();
		titularField.setColumns(10);
		titularField.setBounds(133, 60, 250, 26);
		titularField.setToolTipText("Como consta no cartão");
		panel_cartao.add(titularField);
		campos.add(titularField);
		
		validadeField = new JFormattedTextField(datValCartaoFormat);
		validadeField.setColumns(10);
		validadeField.setBounds(133, 90, 122, 26);
		validadeField.setToolTipText("Formato mes/ano");
		panel_cartao.add(validadeField);
		campos.add(validadeField);
		
		codField = new JFormattedTextField(codigoFormat);
		codField.setColumns(10);
		codField.setBounds(133, 120, 122, 26);
		panel_cartao.add(codField);
		campos.add(codField);
		
		lblDadosDoCarto = new JLabel("Dados do Cartão");
		lblDadosDoCarto.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosDoCarto.setBounds(119, 0, 224, 16);
		panel_cartao.add(lblDadosDoCarto);
		
		JLabel lblNmero = new JLabel("Numero do Cartao");
		lblNmero.setBounds(1, 30, 111, 15);
		panel_cartao.add(lblNmero);
		lblNmero.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setBounds(1, 60, 66, 15);
		panel_cartao.add(lblTitular);
		lblTitular.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblValidade = new JLabel("Validade");
		lblValidade.setBounds(1, 90, 66, 15);
		panel_cartao.add(lblValidade);
		lblValidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblCodSeg = new JLabel("Cod. ");
		lblCodSeg.setBounds(1, 120, 90, 15);
		panel_cartao.add(lblCodSeg);
		lblCodSeg.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		
		panel_habilitacao = new JPanel();
		panel_habilitacao.setBounds(453, 283, 349, 182);
		contentPane.add(panel_habilitacao);
		panel_habilitacao.setLayout(null);
		
		lblHabilitacao = new JLabel("Dados Habilitação");
		lblHabilitacao.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblHabilitacao.setBounds(82, 2, 200, 16);
		panel_habilitacao.add(lblHabilitacao);
		
		JLabel lblRegistroCNH = new JLabel("Registro");
		lblRegistroCNH.setBounds(1, 30, 66, 15);
		panel_habilitacao.add(lblRegistroCNH);
		lblRegistroCNH.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		registro_cnhField = new JFormattedTextField(regCnhFormat);
		registro_cnhField.setBounds(82, 30, 255, 26);
		panel_habilitacao.add(registro_cnhField);
		campos.add(registro_cnhField);
		registro_cnhField.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(0, 56, 66, 15);
		panel_habilitacao.add(lblTipo);
		lblTipo.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		tipocnhField = new JTextField();
		tipocnhField.setColumns(10);
		tipocnhField.setBounds(82, 60, 130, 26);
		panel_habilitacao.add(tipocnhField);
		campos.add(tipocnhField);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(1, 90, 66, 15);
		panel_habilitacao.add(lblCategoria);
		lblCategoria.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		categoriaField = new JFormattedTextField();
		categoriaField.setColumns(10);
		categoriaField.setBounds(82, 90, 75, 26);
		panel_habilitacao.add(categoriaField);
		campos.add(categoriaField);
		
		JLabel lblValidadeCNH = new JLabel("Validade");
		lblValidadeCNH.setBounds(1, 119, 66, 15);
		panel_habilitacao.add(lblValidadeCNH);
		lblValidadeCNH.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		cnhvalidadeField = new JFormattedTextField(datValCnhFormat);
		cnhvalidadeField.setColumns(10);
		cnhvalidadeField.setBounds(82, 120, 130, 26);
		panel_habilitacao.add(cnhvalidadeField);
		campos.add(cnhvalidadeField);
		
		JLabel lblExpedicaoCNH = new JLabel("Expedicao");
		lblExpedicaoCNH .setBounds(0, 150, 66, 15);
		panel_habilitacao.add(lblExpedicaoCNH );
		lblExpedicaoCNH .setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		cnhexpedicaoField = new JFormattedTextField(datExpCnhFormat);
		cnhexpedicaoField.setColumns(10);
		cnhexpedicaoField.setBounds(82, 150, 130, 26);
		panel_habilitacao.add(cnhexpedicaoField);
		campos.add(cnhexpedicaoField);
		}catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		//acao do botao Cadastrar, pegar o que esta nos campos com getText e inserir em suas
		//respectivas tables usando as classes DAO de cada tabela
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					DAO dao = new DAO();
					
					SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	                try {
						Date dtNasc = new Date(df.parse(dataNascimentoField.getText()).getTime());
						Date dtValCart = new Date(df.parse(validadeField.getText()).getTime());
						Date dtValHab = new Date(df.parse(cnhvalidadeField.getText()).getTime());
						Date dtExpHab = new Date(df.parse(cnhexpedicaoField.getText()).getTime());
		          	
					//Insercao de cliente pelos campos de Dados Pessoais
						
					
				        	Cliente cliente = new Cliente(cpfField.getText(), dtNasc, telefoneField.getText(), nomeField.getText());
				        													  //Date.valueOf e pra manter no formato
				        													  //de data do mysql que Ã© yyyy-mm-dd
				        	
				        	dao.adiciona(cliente);
				        	
				        	//Insercao de cartao pelos campos de Dados do Cartao
				        	
				        	Cartao cartao = new Cartao(num_cartaoField.getText(),dtValCart,titularField.getText(),codField.getText());
				        	dao.adiciona(cartao);
				        	
				        	//Insercao de habilitacao pelos campos de Dados Habilitacao
				        	
				        	Habilitacao habilitacao = new Habilitacao(registro_cnhField.getText(),tipocnhField.getText(),categoriaField.getText(),dtValHab,dtExpHab,cliente.getCpf());
				        	dao.adiciona(habilitacao);
				        	
				        	//Insercao de endereco pelos campos de EndereÃ§o
				        	
				        	//nota: o id do endereço não está sendo passado nem gerado
				        	Endereco ender = new Endereco(ruaField.getText() + " " +  numeroField.getText() + " "+ complField.getText(), cepField.getText(),bairroField.getText(), cidadeField.getText(), estadoField.getText());
				        	dao.adiciona(ender);
				        	
				        	//Insercao das tabelas Endereco_cliente e Cartao_cliente possuem foreign keys
				        	
				        	Cartao_Cliente cartcli = new Cartao_Cliente(cliente.getCpf(),cartao.getNmr_cartao());
				        	dao.adiciona(cartcli);
				        	
				        	Endereco_Cliente endcli = new Endereco_Cliente(cliente.getCpf());
				        	
				        	Endereco_Cliente_DAO end_cliDao = new Endereco_Cliente_DAO();
				        	end_cliDao.adiciona(endcli);
				        	
		        	
		        	
		        	
		        	
		        	JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
		        	apagaCampos(campos);
	                }catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						if(e1.getMessage().contains("date"))
							JOptionPane.showMessageDialog(null, "Formato Data Inválido", "Atenção", JOptionPane.WARNING_MESSAGE);
	                


					}
					
					
				
			}
		});
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCadastrar.setBounds(261, 553, 113, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnVoltar.setBounds(492, 553, 93, 25);
		contentPane.add(btnVoltar);
	}
	
	
	public void apagaCampos(List<JTextField> campo) {
		for(JTextField j : campo) {
			j.setText(null);
		}
	

	}
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
}
