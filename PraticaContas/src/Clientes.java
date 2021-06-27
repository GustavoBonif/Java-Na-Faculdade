import java.util.ArrayList;

public class Clientes {
	private String nome, cpf;
	private ArrayList<CCorrente> contas;
	
	public Clientes(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.contas = new ArrayList<CCorrente>();
	}
	
	public void addContas(CCorrente conta){
		contas.add(conta);
	}
		
	public ArrayList<CCorrente> getContas(){
		return contas;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
		
	//@Override
	public String toString(){
		return(" Cliente:" + this.nome +this.contas);
	}
}

