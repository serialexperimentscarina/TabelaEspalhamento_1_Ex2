package controller;

import javax.swing.JOptionPane;

import br.com.serialexperimentscarina.listaobject.ListaObject;
import model.Morador;

public class TabelaMoradorController implements ITabelaMoradorController{
	
	// Tabela de espalhamento que permita cadastrar, consultar e excluir morador, bem como listar
	// os moradores de um determinado andar.
	
	ListaObject[] tabelaDeEspalhamento;
	
	public TabelaMoradorController(int andares) {
		tabelaDeEspalhamento = new ListaObject[andares];
		
		for (int i = 0; i < andares; i++) {
			tabelaDeEspalhamento[i] = new ListaObject();
		}
	}
	
	@Override
	public void adiciona(Morador morador) throws Exception {
		int hash = morador.hashCode();
		ListaObject l = tabelaDeEspalhamento[hash];
		
		l.addFirst(morador);
	}

	@Override
	public void remove(Morador morador) throws Exception {
		int hash = morador.hashCode();
		ListaObject l = tabelaDeEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Morador mrd = (Morador) l.get(i);
			if(mrd.getNumApt() == morador.getNumApt() && mrd.getNome().equals(morador.getNome())) {
				l.remove(i);
				JOptionPane.showMessageDialog(null, "Morador removido com sucesso");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Morador não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public Morador busca(Morador morador) throws Exception {
		int hash = morador.hashCode();
		ListaObject l = tabelaDeEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Morador mrd = (Morador) l.get(i);
			if(mrd.getNumApt() == morador.getNumApt() && mrd.getNome().equals(morador.getNome())) {
				return mrd;
			}
		}
		return null;
	}

	@Override
	public void lista(int andar) throws Exception {
		ListaObject l = tabelaDeEspalhamento[andar - 1];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(l.get(i));
		}
	}
	
	

}
