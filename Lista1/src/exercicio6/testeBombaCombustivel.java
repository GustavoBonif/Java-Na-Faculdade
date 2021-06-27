package exercicio6;

public class testeBombaCombustivel {

	public static void main(String[] args) {
		BombaCombustivel posto = new BombaCombustivel("gasolina", 4.60, 1000);

		System.out.println("Foi gerada a bomba de "+posto.tipoCombustivel+" com o litro a R$"+posto.valorLitro+" e a bomba tem "+posto.quantidadeCombustivel+" litros");
		
		posto.alterarCombustivel("etanol");
		posto.alterarValor(4.49);
		
		System.out.println("Atualizando...");
		System.out.println("O tipo de combustível agora é "+posto.tipoCombustivel+"");
		System.out.println("Abastecer R$50,00, isso vai dar "+posto.abastecePorValor(50)+" litro(s)");
		System.out.println("Quantidade restante da bomba: "+posto.getQuantidadeCombustivel()+" litro(s)");
		
		System.out.println("Abastecer 70, isso vai custar R$"+posto.abastecePorLitro(70)+"");
		System.out.println("Quantidade restante da bomba: "+posto.getQuantidadeCombustivel()+" litro(s)");
	}
}
