package exercicio5;

public class BichinhoVirtual {
	String nome;
	int fome, saude, idade;
	
	public BichinhoVirtual(String nome, int fome, int saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}
	
	public String calculaHumor() {
		double mediaDouble = (this.fome + this.saude)-10;
		int    mediaHumor = (int) Math.round(mediaDouble);
		String humor;
		
		if (mediaHumor >= 0 && mediaHumor <= 3)
			humor = "ruim";
		else if (mediaHumor > 3 && mediaHumor <= 6)
			humor = "normal";
		else if (mediaHumor > 6 && mediaHumor <= 9)
			humor = "bom";
		else if (mediaHumor > 9 && mediaHumor <= 10)
			humor = "ótimo";
		else
			humor = "normal";
			
		return humor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFome(int fome) {
		if (fome > 10)
			System.out.println("Fome máxima atingida ("+this.fome+")");
		else if (fome < 0)
			System.out.println("Fome mínima atingida ("+this.fome+")");
		else
			this.fome = fome;
		
	}
	
	public void setSaude(int saude) {
		if (saude > 10)
			System.out.println("Fome máxima atingida ("+this.saude+")");
		else if (saude < 0)
			System.out.println("Fome mínima atingida ("+this.saude+")");
		else
			this.saude = saude;
		
	}
	
	public void setIdade(int idade) {
		if (idade < 0)
			System.out.println("Idade mínima ("+this.idade+")");
		else
			this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getFome() {
		return this.fome;
	}
	
	public int getSaude() {
		return this.saude;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
