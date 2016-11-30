package me.polles.crudSystem.client.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JProgressBar;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;

public class CarregandoView extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarregandoView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCarregando = new JLabel("Carregando...");
		lblCarregando.setFont(new Font("Arial", Font.BOLD, 23));
		GridBagConstraints gbc_lblCarregando = new GridBagConstraints();
		gbc_lblCarregando.ipady = 50;
		gbc_lblCarregando.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarregando.gridx = 0;
		gbc_lblCarregando.gridy = 0;
		add(lblCarregando, gbc_lblCarregando);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 1;
		add(progressBar, gbc_progressBar);

	}

}
