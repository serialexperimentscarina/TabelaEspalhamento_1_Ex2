package controller;

public interface ITabelaObjetoController {
	
	public void adiciona(Object objeto) throws Exception;
	public void remove(Object objeto) throws Exception;
	public Object busca(Object objeto) throws Exception;

}
