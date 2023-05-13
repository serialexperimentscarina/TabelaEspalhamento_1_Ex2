package controller;

import model.Morador;

public interface ITabelaMoradorController {
	
	// Tabela de espalhamento que permita cadastrar, consultar e excluir morador, bem como listar
	// os moradores de um determinado andar.
	public void adiciona(Morador morador) throws Exception;
	public void remove(Morador morador) throws Exception;
	public Morador busca(Morador morador) throws Exception;
	public void lista(int andar) throws Exception;

}
