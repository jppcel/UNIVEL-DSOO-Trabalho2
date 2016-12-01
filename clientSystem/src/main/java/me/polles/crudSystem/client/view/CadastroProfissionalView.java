package me.polles.crudSystem.client.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import me.polles.crudSystem.Profissional;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.sql.Date;

import javax.swing.JButton;
import java.awt.Font;

public class CadastroProfissionalView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNascimento;
	private JTextField textLogin;
	private JPasswordField textSenha;
	private Profissional profissional;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfissionalView frame = new CadastroProfissionalView();
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
	public CadastroProfissionalView() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Cadastro de Profissional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelNome = new GridBagConstraints();
		gbc_labelNome.anchor = GridBagConstraints.WEST;
		gbc_labelNome.insets = new Insets(0, 0, 5, 0);
		gbc_labelNome.gridx = 0;
		gbc_labelNome.gridy = 0;
		contentPane.add(labelNome, gbc_labelNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textNome = new GridBagConstraints();
		gbc_textNome.insets = new Insets(0, 0, 5, 0);
		gbc_textNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNome.gridx = 0;
		gbc_textNome.gridy = 1;
		contentPane.add(textNome, gbc_textNome);
		textNome.setColumns(10);
		
		JLabel labelNascimento = new JLabel("Data de Nascimento");
		labelNascimento.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelNascimento = new GridBagConstraints();
		gbc_labelNascimento.insets = new Insets(0, 0, 5, 0);
		gbc_labelNascimento.anchor = GridBagConstraints.WEST;
		gbc_labelNascimento.gridx = 0;
		gbc_labelNascimento.gridy = 2;
		contentPane.add(labelNascimento, gbc_labelNascimento);
		
		textNascimento = new JTextField();
		textNascimento.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textNascimento = new GridBagConstraints();
		gbc_textNascimento.insets = new Insets(0, 0, 5, 0);
		gbc_textNascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNascimento.gridx = 0;
		gbc_textNascimento.gridy = 3;
		contentPane.add(textNascimento, gbc_textNascimento);
		textNascimento.setColumns(10);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelLogin = new GridBagConstraints();
		gbc_labelLogin.insets = new Insets(0, 0, 5, 0);
		gbc_labelLogin.anchor = GridBagConstraints.WEST;
		gbc_labelLogin.gridx = 0;
		gbc_labelLogin.gridy = 4;
		contentPane.add(labelLogin, gbc_labelLogin);
		
		textLogin = new JTextField();
		textLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textLogin = new GridBagConstraints();
		gbc_textLogin.insets = new Insets(0, 0, 5, 0);
		gbc_textLogin.anchor = GridBagConstraints.NORTH;
		gbc_textLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLogin.gridx = 0;
		gbc_textLogin.gridy = 5;
		contentPane.add(textLogin, gbc_textLogin);
		textLogin.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelSenha = new GridBagConstraints();
		gbc_labelSenha.insets = new Insets(0, 0, 5, 0);
		gbc_labelSenha.anchor = GridBagConstraints.WEST;
		gbc_labelSenha.gridx = 0;
		gbc_labelSenha.gridy = 6;
		contentPane.add(labelSenha, gbc_labelSenha);
		
		textSenha = new JPasswordField();
		textSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textSenha = new GridBagConstraints();
		gbc_textSenha.insets = new Insets(0, 0, 5, 0);
		gbc_textSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSenha.gridx = 0;
		gbc_textSenha.gridy = 7;
		contentPane.add(textSenha, gbc_textSenha);
		textSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.EAST;
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 8;
		contentPane.add(btnCadastrar, gbc_btnCadastrar);
		
		profissional = new Profissional();
	}

	public void setProfissional(Profissional _profissional){
		this.profissional = _profissional;
	}
	
	public Profissional getProfissional(){
		return this.profissional;
	}
	
	public void updateProfissonal(){
		profissional.setLogin(textLogin.getText());
		profissional.setNascimento();
		profissional.setNome(textNome.getText());
		profissional.setSenha(String.valueOf(textSenha.getPassword()));
	}
	
	public void clear(){
		textLogin.setText("");
		textNascimento.setText("");
		textNome.setText("");
		textSenha.setText("");
	}
}
