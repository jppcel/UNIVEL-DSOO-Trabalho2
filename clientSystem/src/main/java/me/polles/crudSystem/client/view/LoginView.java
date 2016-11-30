package me.polles.crudSystem.client.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("Login");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.anchor = GridBagConstraints.WEST;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 0);
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 0;
		contentPane.add(lblLogin, gbc_lblLogin);
		
		textLogin = new JTextField();
		textLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textLogin = new GridBagConstraints();
		gbc_textLogin.insets = new Insets(0, 0, 5, 0);
		gbc_textLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLogin.gridx = 0;
		gbc_textLogin.gridy = 1;
		contentPane.add(textLogin, gbc_textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.anchor = GridBagConstraints.WEST;
		gbc_lblSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 2;
		contentPane.add(lblSenha, gbc_lblSenha);
		
		textSenha = new JPasswordField();
		textSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textSenha = new GridBagConstraints();
		gbc_textSenha.insets = new Insets(0, 0, 5, 0);
		gbc_textSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSenha.gridx = 0;
		gbc_textSenha.gridy = 3;
		contentPane.add(textSenha, gbc_textSenha);
		textSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.EAST;
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 4;
		contentPane.add(btnCadastrar, gbc_btnCadastrar);
	}
	
	public void clear(){
		textLogin.setText("");
		textSenha.setText("");
	}

}
