package br.ufc.quixada.eda.conjuntosdijuntos;

public class ConjuntoDijuntoLE {
	private Nodo nodo;
	
	public void CriaLista(){
		nodo = null;
	}
	
	public void InserirNComeco(int i){
		Nodo novo = new Nodo();
		novo.setValue(i);
		novo.setProx(nodo);
		nodo = novo;
	}
	
	public boolean isEmpty(){
		if(nodo == null) 
			return true;
		else 
			return false;
	}
	
	public Nodo buscar(int value){
		for(Nodo n = nodo; n != null; n = n.getProx()){
			if(n.getValue() == value) return n;
		}
		return null;
	}
}