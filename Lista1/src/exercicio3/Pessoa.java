package exercicio3;

public class Pessoa {
	private String 	nome;
	private int 	idade;
	private double 	peso, altura;
	
	public Pessoa (String nome, int idade, double peso, double altura) {
		this.nome 	= nome;
		this.idade 	= idade;
		this.peso 	= peso;
		this.altura = altura;
	}
	
	public void engordar() {
		this.peso++;
	}
	
	public void emagrecer() {
		this.peso--;
	}
	
	public void crescer() {
		this.altura += 0.05;
	}
	
	public void envelhecer() {
		this.idade++;
		
		if(this.idade < 21) {
			this.crescer();
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
}
