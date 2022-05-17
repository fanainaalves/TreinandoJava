package Calculadora;

public class MultiplicacaoPor2 {
	public int tabuada = 2;
	public int i ;
		
	public MultiplicacaoPor2() {
		super();	
	}

	public int getTabuada() {
		return tabuada;
	}

	public void setTabuada(int tabuada) {
		this.tabuada = tabuada;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void Calcular() {
		for (i = 0; i <= 10; i++){
			System.out.println(tabuada * i);
		}
	}
	

}

