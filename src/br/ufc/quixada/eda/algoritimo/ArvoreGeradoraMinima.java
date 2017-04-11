package br.ufc.quixada.eda.algoritimo;
import br.ufc.quixada.eda.conjuntosdijuntos.FlorestaDeConjuntosDisjuntos;
import br.ufc.quixada.eda.grafos.Aresta;
import br.ufc.quixada.eda.grafos.Grafo;
import br.ufc.quixada.eda.util.EDAUtil;

import java.util.ArrayList;
import java.util.List;

public class ArvoreGeradoraMinima {

	public List<Aresta> Kruskal(Grafo g){
		List<Aresta> solucao = new ArrayList<Aresta>();
		FlorestaDeConjuntosDisjuntos conj = new FlorestaDeConjuntosDisjuntos(g.getN());
		
		for(int i = 0; i < g.getN(); i++){
			conj.make_set(i);
		}
		
		EDAUtil.quicksortList(g.getArestas(), 0, g.getArestas().size() - 1);
		//EDAUtil.ordenarListAresta(g.getArestas());
		
		for(int i = 0; i < g.getM(); i++){
			Aresta a = g.getArestas().get(i);
			if(conj.find_set(a.getV()) != conj.find_set(a.getU())){
				solucao.add(a);
				conj.union(a.getV(), a.getU());
			}
		}
		return solucao;
	}
}