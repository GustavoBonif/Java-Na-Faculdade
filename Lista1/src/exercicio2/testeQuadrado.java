package exercicio2;

public class testeQuadrado {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonifácio Conceição
		//Turma: BSI 2021.1
		
		Quadrado campo = new Quadrado(50);
		
		System.out.println("Esse quadrado tem "+campo.getTamanho()+"m de lado tem uma área de "+campo.getArea()+"m²");
		campo.setTamanho(70);
		System.out.println("Agora esse quadrado tem "+campo.getTamanho()+"m de lado tem uma área de "+campo.getArea()+"m²");
	}

}
