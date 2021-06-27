package exercicio6;

public class BombaCombustivel {
	String tipoCombustivel;
	double valorLitro;
	double quantidadeCombustivel;
	
	public BombaCombustivel(String tipo, double valor, int qtdComb) {
		this.tipoCombustivel = tipo;
		this.valorLitro = valor;
		this.quantidadeCombustivel = qtdComb;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void alterarCombustivel(String tipo) {
		this.tipoCombustivel = tipo;
	}
	public double getValorLitro() {
		return valorLitro;
	}
	public void alterarValor(double valor) {
		this.valorLitro = valor;
	}
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void alterarQuantidadeCombustivel(double qtdComb) {
		this.quantidadeCombustivel = qtdComb;
	}
	
	public double abastecePorValor(double valor) {
		double litrosAbastecidos = valor / this.valorLitro;
		litrosAbastecidos = (double) Math.round(litrosAbastecidos*100)/100;
		
		this.quantidadeCombustivel -= litrosAbastecidos;
		return litrosAbastecidos;
	}
	
	public double abastecePorLitro(double litros) {
		double litrosAbastecidos = litros / this.valorLitro;
		litrosAbastecidos = (double) Math.round(litrosAbastecidos*100)/100;
		
		this.quantidadeCombustivel -= litros;
		return litrosAbastecidos;
	}
	
	
}
