package interfaces;

import models.ModelPassageiro;

public interface InterfaceRepositorioPassageiros {
	
	public void inserir(ModelPassageiro Pessoa) throws Exception;
	
	public void excluir(String CPF) throws Exception;
	
	public void atualizar(String CPF, String novoNome) throws Exception;
	
	public ModelPassageiro procurar(String nomePessoa) throws Exception;
	
}
