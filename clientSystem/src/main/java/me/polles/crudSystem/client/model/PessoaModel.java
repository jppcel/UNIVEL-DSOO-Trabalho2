package me.polles.crudSystem.client.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import me.polles.crudSystem.Pessoa;

public class PessoaModel extends AbstractTableModel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1077595320065349084L;
	
	
	private String[] nomesColunas = {"Nome", "Data de Nascimento", "CPF", "RG"};
    private Map<Integer, Pessoa> pessoas;
    
    public PessoaModel(Collection<Pessoa> _pessoas){
    	this.pessoas = new HashMap<Integer, Pessoa>();
    	_pessoas.forEach(pessoa -> {
    		pessoas.put(pessoa.getId(), pessoa);    		
    	});
    }
	
	public int getColumnCount() {
		return 4;
	}

	public int getRowCount() {
		return pessoas.size();
	}

	@Override
	public Object getValueAt(int id, int column) {

		   Pessoa p = pessoas.get(id+1);

			switch (column) {
				case 0:
					return p.getNome();
				case 1:
					return p.getNascimento();
				case 2:
					return p.getCpf();
				case 3:
					return p.getRg();
	        }          
			
			return null;
	}
	
    @Override
    public String getColumnName(int index) {
        return nomesColunas[index];
    }

}
