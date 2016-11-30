package me.polles.crudSystem.client.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CadastroPessoaView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNascimento;
	private JTextField textCpf;
	private JTextField textRg;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoaView frame = new CadastroPessoaView();
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
	public CadastroPessoaView() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 235);
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
		
		JLabel labelCpf = new JLabel("CPF");
		labelCpf.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelCpf = new GridBagConstraints();
		gbc_labelCpf.insets = new Insets(0, 0, 5, 0);
		gbc_labelCpf.anchor = GridBagConstraints.WEST;
		gbc_labelCpf.gridx = 0;
		gbc_labelCpf.gridy = 4;
		contentPane.add(labelCpf, gbc_labelCpf);
		
		textCpf = new JTextField();
		textCpf.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textCpf = new GridBagConstraints();
		gbc_textCpf.insets = new Insets(0, 0, 5, 0);
		gbc_textCpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCpf.gridx = 0;
		gbc_textCpf.gridy = 5;
		contentPane.add(textCpf, gbc_textCpf);
		textCpf.setColumns(10);
		
		JLabel labelRg = new JLabel("RG");
		labelRg.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_labelRg = new GridBagConstraints();
		gbc_labelRg.insets = new Insets(0, 0, 5, 0);
		gbc_labelRg.anchor = GridBagConstraints.WEST;
		gbc_labelRg.gridx = 0;
		gbc_labelRg.gridy = 6;
		contentPane.add(labelRg, gbc_labelRg);
		
		textRg = new JTextField();
		textRg.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_textRg = new GridBagConstraints();
		gbc_textRg.insets = new Insets(0, 0, 5, 0);
		gbc_textRg.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRg.gridx = 0;
		gbc_textRg.gridy = 7;
		contentPane.add(textRg, gbc_textRg);
		textRg.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.EAST;
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 8;
		contentPane.add(btnCadastrar, gbc_btnCadastrar);
	}
	
	public void clear(){
		textNome.setText("");
		textCpf.setText("");
		textNascimento.setText("");
		textRg.setText("");
	}

}
