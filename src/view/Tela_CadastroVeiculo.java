package view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
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

import control.Veiculo;
import model.DAO;

public class Tela_CadastroVeiculo  extends javax.swing.JInternalFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JTextField ModeloField;
	private JTextField LocadorField;
	private JLabel lblLocador;
	private JLabel lblTipo;
	private JLabel lblPlaca;
	private JTextField FilialField;
	private JTextField TipoField;
	private JLabel lblMarca;
	private JTextField PlacaField;
	private JTextField MarcaField;
	private JLabel lblVeiculo;
	private JLabel lblFilial;
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
	public Tela_CadastroVeiculo() {
		
		try {
			MaskFormatter placaFormat = new MaskFormatter("UUU-####");
		
		
		
		
		setTitle( "Cadastrar Veiculo" );
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
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblPlaca.setBounds(6, 35, 66, 15);
		panel.add(lblPlaca);
		
		PlacaField = new JFormattedTextField(placaFormat);
		PlacaField.setToolTipText("Sem separadores ex: ABC1234" );
		PlacaField.setColumns(10);
		PlacaField.setBounds(55, 35, 255, 26);
		panel.add(PlacaField);
		campos.add(PlacaField);
		
		MarcaField = new JTextField();
		MarcaField.setColumns(10);
		MarcaField.setBounds(55, 65, 255, 26);
		panel.add(MarcaField);
		campos.add(MarcaField);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblMarca.setBounds(6, 65, 66, 15);
		panel.add(lblMarca);
		
		lblTipo = new JLabel("Tipo.");
		lblTipo.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblTipo.setBounds(6, 95, 66, 15);
		panel.add(lblTipo);
		
		lblLocador = new JLabel("Locador");
		lblLocador.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblLocador.setBounds(6, 155, 66, 15);
		panel.add(lblLocador);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblModelo.setBounds(6, 125, 66, 15);
		panel.add(lblModelo);
		
		
		ModeloField = new JTextField();
		ModeloField.setColumns(10);
		ModeloField.setBounds(55, 125, 255, 26);
		panel.add(ModeloField);
		campos.add(ModeloField);
		
		
		TipoField = new JTextField();
		TipoField.setColumns(10);
		TipoField.setBounds(55, 95, 255, 26);
		panel.add(TipoField);
		campos.add(TipoField);
		
		lblFilial = new JLabel("Filial");
		lblFilial.setFont(new Font("Jamrul", Font.PLAIN, 11));
		lblFilial.setBounds(6, 185, 66, 15);
		panel.add(lblFilial);
		
		LocadorField = new JTextField();
		LocadorField.setColumns(10);
		LocadorField.setBounds(55, 155, 255, 26);
		panel.add(LocadorField);
		campos.add(LocadorField);
		
		FilialField = new JTextField();
		FilialField.setColumns(10);
		FilialField.setBounds(55, 185, 255, 26);
		panel.add(FilialField);
		campos.add(FilialField);
		
		lblVeiculo = new JLabel("Veiculo");
		lblVeiculo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 14));
		lblVeiculo.setBounds(136, 0, 124, 16);
		panel.add(lblVeiculo);
		
		
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		//acao do botao Cadastrar, pegar o que esta nos campos com getText e inserir em suas
		//respectivas tables usando as classes DAO de cada tabela
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					DAO dao = new DAO();
					
					//Insercao de veiculo pelos campos de Veiculo
		        	Veiculo veiculo = new Veiculo(ModeloField.getText(), LocadorField.getText(), TipoField.getText(), MarcaField.getText(), PlacaField.getText(), FilialField.getText());
		        	dao.adiciona(veiculo);
		        	
		        	JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
		        	apagaCampos(campos);
		        	
					
				
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
