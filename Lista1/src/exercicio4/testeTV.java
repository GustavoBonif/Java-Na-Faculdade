package exercicio4;

public class testeTV {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonif�cio Concei��o
		//Turma: BSI 2021.1
		
		TV tvQuarto = new TV(71, 0);
		System.out.println("A tv est� no canal "+tvQuarto.getCanal()+" no volume "+tvQuarto.getVolume());
		tvQuarto.setCanal(39);
		System.out.println("Agora a tv est� no canal "+tvQuarto.getCanal());
		tvQuarto.aumentarVolume();
		System.out.println("O volume da tv aumentou e est� em "+tvQuarto.getVolume());
		tvQuarto.diminuirVolume();
		tvQuarto.diminuirVolume();
		tvQuarto.diminuirVolume();
		System.out.println("Volume "+tvQuarto.getVolume());
	}

}
