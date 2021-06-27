package exercicio1;

public class Bola {
	private String cor, material;
	private double circunferencia;
	
	public Bola(String cor, String mat, double cir) {
		this.cor = cor;
		this.material = mat;
		this.circunferencia = cir;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
}
