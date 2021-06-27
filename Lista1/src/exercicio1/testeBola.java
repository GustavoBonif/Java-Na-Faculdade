package exercicio1;

public class testeBola {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonifácio Conceição
		//Turma: BSI 2021.1
		
		Bola bolaFutebol = new Bola("verde", "tecido", 20);
		
		System.out.println("A cor da bola é "+bolaFutebol.getCor()+".");
		bolaFutebol.setCor("azul");
		System.out.println("Agora a cor da bola é "+bolaFutebol.getCor()+".");
	}

}
