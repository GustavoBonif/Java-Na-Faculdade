
public class testeContas {

	public static void main(String[] args) {
		//Aluno: Gustavo Bonifácio Conceição
		//Turma: BSI 2021.1
		
		ListaClientes lista = new ListaClientes();
		
		Clientes cli1 = new Clientes("Joice", "1234567");
		Clientes cli2 = new Clientes("João",  "1111111");
		Clientes cli3 = new Clientes("Ivo",   "2323232");
		Clientes cli4 = new Clientes("Ana",   "3131313");
		Clientes cli5 = new Clientes("Cida",  "5151525");
		
		lista.addClientes(cli1);
		lista.addClientes(cli2);
		lista.addClientes(cli3);
		lista.addClientes(cli4);
		lista.addClientes(cli5);
		
		CCorrente conta1 = new CCorrente(1, 1000);
		cli1.addContas(conta1);
		
		CEspecial conta2 = new CEspecial(2, 2000, 5000);
		cli2.addContas(conta2);
		
		CPoupanca conta3 = new CPoupanca(3,1300, 1000);
		cli2.addContas(conta3);
		
		CInvestimento conta4 = new CInvestimento(4, 1000, 24, 7);
		cli3.addContas(conta4);
		
		CInvestimento conta5 = new CInvestimento(5, 1500, 28, 5);
		cli3.addContas(conta5);
		
		CInvestimento conta6 = new CInvestimento(6, 5000, 20, 5);
		cli4.addContas(conta6);
		
		lista.imprimeClientes();
		System.out.println("\n----------------------------");

	}

}
