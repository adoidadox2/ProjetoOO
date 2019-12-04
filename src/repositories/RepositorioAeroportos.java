package repositories;

import java.util.ArrayList;
import interfaces.InterfaceRepositorioAeroportos;
import models.ModelAeroporto;

public class RepositorioAeroportos implements InterfaceRepositorioAeroportos{
	ArrayList<ModelAeroporto> Aeroportos = new ArrayList<ModelAeroporto>();
	
	public void inserir(ModelAeroporto aeroporto) throws Exception{
		this.Aeroportos.add(aeroporto);
	}
	
	public void excluir(String nomeAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		if(aeroportoAuxiliar != null) {
			this.Aeroportos.remove(aeroportoAuxiliar);
		}else {
			throw new Exception();
		}		
	}
	
	public void atualizar(String nomeAeroporto, String novoNome) throws Exception{
		int index = 0;
		
		ModelAeroporto aeroportoAuxiliar = procurar(nomeAeroporto);
		
		if(aeroportoAuxiliar != null) {
			aeroportoAuxiliar.setNome_aeroporto(novoNome);
		    
			index = Aeroportos.indexOf(aeroportoAuxiliar);
			Aeroportos.add(index, aeroportoAuxiliar);
		}else {
			throw new Exception();
		}
		
	}

	public ModelAeroporto procurar(String nomeAeroporto) throws Exception{
		ModelAeroporto aeroportoAuxiliar = new ModelAeroporto(nomeAeroporto);
		int index = Aeroportos.indexOf(aeroportoAuxiliar);
		
		if(index == -1) {
			throw new Exception();
		}else {
			return Aeroportos.get(index);
		}
	}

}
