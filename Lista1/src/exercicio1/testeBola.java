package exercicio1;

public class testeBola {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonif�cio Concei��o
		//Turma: BSI 2021.1
		
		Bola bolaFutebol = new Bola("verde", "tecido", 20);
		
		System.out.println("A cor da bola � "+bolaFutebol.getCor()+".");
		bolaFutebol.setCor("azul");
		System.out.println("Agora a cor da bola � "+bolaFutebol.getCor()+".");
	}

}
