
public class CCorrente {
	 private int numero;
	 private double saldo;

	 public CCorrente (int num, double sal){
		 this.numero = num;
		 this.saldo = sal;
	 }
	
	 public void creditar(double valor){
		 this.saldo = this.saldo + valor;
	 }
	
	 public void debitar(double valor){
		 if (valor <= this.saldo) {
			 this.saldo = this.saldo - valor;
		 } else {
			 System.out.println("Saldo Insuficiente");
		 }
	 }

	 public double get_saldo(){
		 return this.saldo;
	 }
	 
	public void set_saldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getNumero(){
		 return this.numero;
	 }
	
	//@override
	public String toString() {
		return ("Conta:" + this.numero + " Saldo:" + this.saldo);
	}

}




