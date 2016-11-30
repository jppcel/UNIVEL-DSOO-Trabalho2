package me.polles.crudSystem.client.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultView extends JFrame {

	private JPanel contentPane;
	private CadastroPessoaView cadastroPessoaView;
	private CadastroProfissionalView cadastroProfissionalView;
	private LoginView loginView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultView frame = new DefaultView();
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
	public DefaultView() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnMenu);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
		});
		mntmCliente.setFont(new Font("Arial", Font.PLAIN, 11));
		mnMenu.add(mntmCliente);
		
		JMenuItem mntmProfissional = new JMenuItem("Profissional");
		mntmProfissional.setFont(new Font("Arial", Font.PLAIN, 11));
		mnMenu.add(mntmProfissional);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(new JPanel(), "white");
		contentPane.add(new CarregandoView(), "carregando");
		
		
		
		cadastroPessoaView = new CadastroPessoaView();
		cadastroProfissionalView = new CadastroProfissionalView();
		loginView = new LoginView();
		
		
	}

}
