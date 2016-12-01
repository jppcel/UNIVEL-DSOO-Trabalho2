package me.polles.crudSystem.client.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Collection;

import javax.swing.JTable;

import me.polles.crudSystem.Pessoa;
import me.polles.crudSystem.client.controller.PessoaController;
import me.polles.crudSystem.client.model.PessoaModel;

public class ListarPessoaPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListarPessoaPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 3;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		add(table, gbc_table);
		
		JButton button_2 = new JButton("\u270D");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.EAST;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 1;
		add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("-");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 1;
		add(button_1, gbc_button_1);
		
		JButton button = new JButton("+");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		add(button, gbc_button);

	}
	
	public void updateTable(){
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNascimento(new Date());
		pessoa.setNome("João");
		pessoa.setCpf("555.555.555-44");
		pessoa.setRg("1.111.111");
		PessoaController pessoaController = new PessoaController();
		pessoaController.addPessoa(pessoa);
		PessoaModel pessoaModel = new PessoaModel(pessoaController.getPessoas());
		table.setModel(pessoaModel);
	}

}
