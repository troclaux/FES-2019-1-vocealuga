package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblDadosDoCarto;
	private JLabel lblCep;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblRua;
	private JLabel lblCompl;
	private JLabel lblBairro;
	private JLabel lblN;
	private JTextField textField_12;
	private JTextField textField_10;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblDadosPessoais;
	private JLabel lblEndereo;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmero = new JLabel("Numero");
		lblNmero.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblNmero.setBounds(12, 175, 66, 15);
		contentPane.add(lblNmero);
		
		JLabel lblValidade = new JLabel("Validade");
		lblValidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblValidade.setBounds(12, 217, 66, 15);
		contentPane.add(lblValidade);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblTitular.setBounds(12, 197, 66, 15);
		contentPane.add(lblTitular);
		
		JLabel lblCodSeg = new JLabel("Cod. ");
		lblCodSeg.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCodSeg.setBounds(12, 236, 90, 15);
		contentPane.add(lblCodSeg);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("sd");
		panel.setBounds(234, 13, 198, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCep.setBounds(6, 39, 66, 15);
		panel.add(lblCep);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(55, 36, 49, 17);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(55, 55, 77, 17);
		panel.add(textField_9);
		
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
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(153, 56, 32, 17);
		panel.add(textField_12);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(55, 74, 130, 17);
		panel.add(textField_10);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblCidade.setBounds(6, 115, 66, 15);
		panel.add(lblCidade);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblEstado.setBounds(6, 134, 66, 15);
		panel.add(lblEstado);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(55, 93, 130, 17);
		panel.add(textField_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(55, 112, 130, 17);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(55, 131, 130, 17);
		panel.add(textField_14);
		
		lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblEndereo.setBounds(7, 7, 124, 16);
		panel.add(lblEndereo);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("sd");
		panel_1.setBounds(12, 13, 212, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 32, 124, 17);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 51, 93, 17);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(65, 70, 93, 17);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(65, 89, 93, 17);
		panel_1.add(textField_3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(0, 35, 66, 15);
		panel_1.add(lblNome);
		lblNome.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(0, 54, 66, 15);
		panel_1.add(lblCpf);
		lblCpf.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblCnh = new JLabel("CNH");
		lblCnh.setBounds(0, 73, 66, 15);
		panel_1.add(lblCnh);
		lblCnh.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setBounds(0, 92, 66, 15);
		panel_1.add(lblTel);
		lblTel.setFont(new Font("Jamrul", Font.PLAIN, 11));
		
		lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosPessoais.setBounds(2, 7, 124, 16);
		panel_1.add(lblDadosPessoais);
		
		panel_2 = new JPanel();
		panel_2.setToolTipText("sd");
		panel_2.setBounds(12, 139, 212, 116);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(58, 36, 124, 17);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(58, 55, 124, 17);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(58, 74, 64, 17);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(58, 93, 41, 17);
		panel_2.add(textField_7);
		
		lblDadosDoCarto = new JLabel("Dados do Cartão");
		lblDadosDoCarto.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblDadosDoCarto.setBounds(1, 7, 124, 16);
		panel_2.add(lblDadosDoCarto);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnCadastrar.setBounds(229, 215, 93, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnVoltar.setBounds(334, 215, 93, 25);
		contentPane.add(btnVoltar);
	}
}
