package br.ufc.quixada.eda.grafos;
import java.util.List;
import java.util.ArrayList;

public class Grafo {
 private int n;
 private int m;
 private List<Aresta> Arestas;

public Grafo(int n, int m) {
	this.n = n;
	this.m = m;
	Arestas = new ArrayList<Aresta>();
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public int getM() {
	return m;
}

public void setM(int m) {
	this.m = m;
}

public List<Aresta> getArestas() {
	return Arestas;
}

public void setAresta(List<Aresta> aresta) {
	this.Arestas = aresta;
}
 
 
}
