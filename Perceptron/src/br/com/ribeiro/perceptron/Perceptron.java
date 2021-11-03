package br.com.ribeiro.perceptron;

public class Perceptron {
	
	private Integer heaviside(Integer x) {
		if (x >= 0) return 1;
		return 0;
	}
	
	public Integer perceptron(Double[] x, Double[] w, Double b) {
		
		Double v = 0.0;
		for(int i = 0; i < x.length ; i++) {
			v = v + (x[i] * w[i]);
		}
		v = v + b;
		return heaviside(v.intValue());
	}
	
	public Integer perceptron(Integer[] x, Integer[] w, Double b) {
		
		Double v = 0.0;
		
		for(int i = 0 ; i < x.length ; i++) {
			v = v + (x[i] * w[0]);
		}
		
		v = v + b;
		return heaviside(v.intValue());                                                                                                  
	}
	
	
}
