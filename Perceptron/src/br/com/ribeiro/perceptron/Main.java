package br.com.ribeiro.perceptron;

public class Main {
	public static void main(String[] args) {
		
		// Implementação Perceptron Simples
		Perceptron p = new Perceptron();
		
		Double[] x = {0.3,0.0,1.0};
		Double[] w = {0.5,0.2,0.1};
		
		Integer r = p.perceptron(x,w, 0.0);		
		System.out.println(r);
		
		// Entradas
		Integer[][] entradas = {{0,0},{0,1},{1,0},{1,1}};		
		
		// Implementação Porta Lógica AND
		Object[] AND = {entradas, new Integer[]{1}, -2.5, "AND"};
		perceptron(AND);
		
		// Implementação Porta Lógica OR
		Object[] OR = {entradas, new Integer[]{1}, -1.5, "OR"};
		perceptron(OR);
		
		// Implementação Porta Lógica NOT
		System.out.println("NOT(0) = " + p.perceptron(new Integer[] {0}, new Integer[] {-1}, 0.5) );
		System.out.println("NOT(1) = " + p.perceptron(new Integer[] {1}, new Integer[] {-1}, -0.5) );
	}
	
	private static void perceptron(Object[] obj) {
		
		if (obj.length < 4) throw new IllegalArgumentException("Algo de errado");
		
		Perceptron p = new Perceptron();
		
		Integer[][] entradas = (Integer[][]) obj[0];
		Integer[] peso = (Integer[]) obj[1];
		Double bias = (Double) obj[2];
		String gate = (String) obj[3];
		
		for(int i = 0; i < entradas.length; i++) {
			Integer[] entrada = entradas[i];
			System.out.println(gate+"( "+ entradas[i][0] + ", " + entradas[i][1] + ") = " + p.perceptron(entrada, peso, bias));
		}
		System.out.println("");
		
	}
}
