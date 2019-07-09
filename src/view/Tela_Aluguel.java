package view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import control.Aluguel;
import model.DAO;

public class Tela_Aluguel  extends javax.swing.JInternalFrame {

	private JPanel contentPane;
	private JLabel lbldataFim;
	private JTextField dataFimField;
	private JTextField dataInicioField;
	private JLabel lbldataInicio;
	private JLabel lblplacaVeiculo;
	private JLabel lblidRegistro;
	private JTextField valorField;
	private JTextField placaVeiculoField;
	private JLabel lblcpfCliente;
	private JTextField idRegistroField;
	private JTextField cpfClienteField;
	private JLabel lblAluguel;
	private JLabel lblvalor;
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
	public Tela_Aluguel() {
		
		try {
			MaskFormatter placaFormat = new MaskFormatter("UUU-####");
			MaskFormatter cpfFormat = new MaskFormatter("###.###.###-##");
		
		
		
		setTitle( "Realizar Locação" );
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
		panel.setBounds(1, 1, 422, 223);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblidRegistro = new JLabel("ID Registro");
		lblidRegistro.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblidRegistro.setBounds(6, 35, 86, 15);
		panel.add(lblidRegistro);
		
		idRegistroField = new JFormattedTextField();
		idRegistroField.setColumns(10);
		idRegistroField.setBounds(125, 35, 80, 26);
		panel.add(idRegistroField);
		campos.add(idRegistroField);
		
		cpfClienteField = new JFormattedTextField(cpfFormat);
		cpfClienteField.setToolTipText("Sem separadores ex: 1234567894" );
		cpfClienteField.setColumns(10);
		cpfClienteField.setBounds(125, 65, 255, 26);
		panel.add(cpfClienteField);
		campos.add(cpfClienteField);
		
		lblcpfCliente = new JLabel("CPF Cliente");
		lblcpfCliente.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblcpfCliente.setBounds(6, 65, 86, 15);
		panel.add(lblcpfCliente);
		
		lblplacaVeiculo = new JLabel("Placa Veiculo");
		lblplacaVeiculo.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblplacaVeiculo.setBounds(6, 95, 86, 15);
		panel.add(lblplacaVeiculo);
		
		lbldataInicio = new JLabel("Data Inicial");
		lbldataInicio.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lbldataInicio.setBounds(6, 125, 86, 15);
		panel.add(lbldataInicio);
		
		lbldataFim = new JLabel("Data Final");
		lbldataFim.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lbldataFim.setBounds(6, 155, 86, 15);
		panel.add(lbldataFim);
		
		
		dataFimField = new JTextField();
		dataFimField.setToolTipText("Formato dia/mes/ano");
		dataFimField.setColumns(10);
		dataFimField.setBounds(125, 155, 255, 26);
		panel.add(dataFimField);
		campos.add(dataFimField);
		
		
		placaVeiculoField = new JFormattedTextField(placaFormat);
		placaVeiculoField.setToolTipText("Sem separadores ex: ABC1234" );
		placaVeiculoField.setColumns(10);
		placaVeiculoField.setBounds(125, 95, 255, 26);
		panel.add(placaVeiculoField);
		campos.add(placaVeiculoField);
		
		lblvalor = new JLabel("Valor Total  R$");
		lblvalor.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblvalor.setBounds(6, 185, 106, 15);
		panel.add(lblvalor);
		
		dataInicioField = new JTextField();
		dataInicioField.setToolTipText("Formato dia/mes/ano");
		dataInicioField.setColumns(10);
		dataInicioField.setBounds(125, 125, 255, 26);
		panel.add(dataInicioField);
		campos.add(dataInicioField);
		
		valorField = new JFormattedTextField();
		valorField.setColumns(10);
		valorField.setBounds(125, 185, 255, 26);
		valorField.setToolTipText("Separar por ponto ex: 1000.34");
		panel.add(valorField);
		campos.add(valorField);
		
		lblAluguel = new JLabel("Registro de Locação");
		lblAluguel.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblAluguel.setBounds(136, 0, 204, 16);
		panel.add(lblAluguel);
		
		
		} catch (ParseException e2) {
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
						Date dtIni = new Date(df.parse(dataInicioField.getText()).getTime());
						Date dtFin = new Date(df.parse(dataFimField.getText()).getTime());
						
						//Insercao de veiculo pelos campos de Aluguel
			        	Aluguel aluguel = new Aluguel(dtIni, dtFin, Float.parseFloat(valorField.getText()), cpfClienteField.getText(), placaVeiculoField.getText(), Integer.parseInt(idRegistroField.getText()));
			        	dao.adiciona(aluguel);
			        	
			        	JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
			        	apagaCampos(campos);
					}catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
			j.setText("");
		}

	}
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
}
