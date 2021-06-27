package exercicio3;

public class testePessoa {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonifácio Conceição
		//Turma: BSI 2021.1
		
		Pessoa alguem = new Pessoa("Gustavo", 19, 53.50, 1.75);
			
		System.out.println("A pessoa "+alguem.getNome()+" tem "+alguem.getIdade()+" anos, com "+alguem.getPeso()+" kilos e "+alguem.getAltura()+"m de altura");
		
		alguem.crescer();
		alguem.engordar();
		
		System.out.println("A pessoa "+alguem.getNome()+" agora tem "+alguem.getPeso()+" kilos e "+alguem.getAltura()+"m de altura");
		
		alguem.emagrecer();
		alguem.envelhecer();
		
		System.out.println("A pessoa "+alguem.getNome()+" emagreceu e tem "+alguem.getPeso()+" kilos. Também envelheceu e agora tem "+alguem.getIdade()+" anos e "+alguem.getAltura()+"m de altura");
	}

}
