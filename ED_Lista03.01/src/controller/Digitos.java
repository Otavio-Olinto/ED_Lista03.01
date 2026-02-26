package controller;

public class Digitos {

	public Digitos() {
		super();
	}
	
	public int quantidade(int num) {
		
		int qnt=0;
		
		// A quantidade de digitos de um número é proporcional a quantas vezes ele pode ser
		// Dividido por 10. Portanto a condição de parada é quando este número for menor que 10
		if(num<10) return 1;
		
		if(num/10>0) qnt++;
		
		// Mesmo que a divisão por 10 possa resultar num número fracionário, não é relevante
		// Para este caso, pois queremos apenas a parte inteira
		return qnt+quantidade(num/10);
	}

}
