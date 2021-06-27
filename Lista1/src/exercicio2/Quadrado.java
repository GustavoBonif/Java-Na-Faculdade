package exercicio2;

public class Quadrado {
	private int tamanhoLado;
	
	public Quadrado(int tamanho) {
		this.tamanhoLado = tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanhoLado = tamanho;
	}
	
	public int getTamanho() {
		return this.tamanhoLado;
	}
	
	public int getArea() {
		return (this.tamanhoLado*2);
	}
}
