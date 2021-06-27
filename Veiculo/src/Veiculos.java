
public class Veiculos {

	private int passageiros, combustivel, consumo;
	
	public Veiculos(int pass, int comb, int cons) {
		this.passageiros = pass;
		this.combustivel = comb;
		this.consumo = cons;
	}
	
	public int calcularAutonomia() {
		return (this.combustivel * this.consumo);
	}
	
	public int getPassageiros() {
		return this.passageiros;
	}
}
