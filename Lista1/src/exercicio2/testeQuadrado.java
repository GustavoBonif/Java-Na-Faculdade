package exercicio2;

public class testeQuadrado {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonif�cio Concei��o
		//Turma: BSI 2021.1
		
		Quadrado campo = new Quadrado(50);
		
		System.out.println("Esse quadrado tem "+campo.getTamanho()+"m de lado tem uma �rea de "+campo.getArea()+"m�");
		campo.setTamanho(70);
		System.out.println("Agora esse quadrado tem "+campo.getTamanho()+"m de lado tem uma �rea de "+campo.getArea()+"m�");
	}

}
