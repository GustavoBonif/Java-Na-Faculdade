package exercicio5;

public class testeBichinhoVirtual {

	public static void main(String[] args) {
		BichinhoVirtual tamaguchi = new BichinhoVirtual("Bubassauro", 4, 7, 14);
		
		System.out.println(" Nome: "+tamaguchi.getNome()+","
			+ "\r\n idade: "+tamaguchi.getIdade()+","
			+ "\r\n fome:   "+tamaguchi.getFome()+","
			+ "\r\n saúde: "+tamaguchi.getSaude()+","
			+ "\r\n humor: "+tamaguchi.calculaHumor());
		
		tamaguchi.setFome(7);
		tamaguchi.setSaude(10);
		tamaguchi.setIdade(15);
		
		System.out.println("------ novos valores -----");
		
		System.out.println(" Nome: "+tamaguchi.getNome()+","
				+ "\r\n idade: "+tamaguchi.getIdade()+","
				+ "\r\n fome:   "+tamaguchi.getFome()+","
				+ "\r\n saúde: "+tamaguchi.getSaude()+","
				+ "\r\n humor: "+tamaguchi.calculaHumor());
		
		
	}
	
	

}
