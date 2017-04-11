package br.ufc.quixada.eda.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufc.quixada.eda.grafos.Aresta;
import br.ufc.quixada.eda.grafos.Grafo;

public class EDAUtil {
	/**
	 * Ler o arquivo que contém as prioridades iniciais da lista de prioridades.
	 * @param path
	 * @return
	 * @throws IOException
	 */
    public static List<Integer> getDadosIniciais(String path) throws IOException {
        List<Integer> entrada = new ArrayList<Integer>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\r\n");
		while (scanner.hasNext())
			entrada.add(scanner.nextInt());
		
		scanner.close();
        return entrada;
    }
    
    /**
     * Ler as operações que serão realizadas na lista de prioridades após a sua criação.
     * @param path
     * @return
     * @throws IOException
     */
    public static List<Operacao> getOperacoes(String path) throws IOException {
        List<Operacao> operacoes = new ArrayList<Operacao>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");	
		while (scanner.hasNext())
			operacoes.add(new Operacao(scanner.next(), scanner.nextInt(), scanner.nextInt()));
			
		scanner.close();
        return operacoes;
    }
    
    public static Grafo getGrafo(String path) throws IOException{
    	Grafo g = null;
    	Scanner scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");
    	if(scanner.hasNext()){
    		g = new Grafo(scanner.nextInt(), scanner.nextInt());
    		while(scanner.hasNext())
    			g.getArestas().add(new Aresta(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    	}
    	
    	scanner.close();
    	return g;
    }
}
