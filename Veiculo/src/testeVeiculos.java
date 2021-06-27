
public class testeVeiculos {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonifácio Conceição
		//Turma: BSI 2021.1
		
		Veiculos minivan = new Veiculos(7, 80, 9);
		
		System.out.print("A minivan transporta "+minivan.getPassageiros()+" passageiros e tem "+minivan.calcularAutonomia()+" km de autonomia.");

	}

}
