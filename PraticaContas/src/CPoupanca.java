public class CPoupanca extends CCorrente {
	
	private double saldominimo;
	
	 public CPoupanca(int num, double sal, double salmin) {
		 super(num, sal);
		 this.saldominimo = salmin;
	 }
	
	//@Override
	public void debitar(double valor){
		 if (valor <= super.get_saldo()) {
			 super.set_saldo(super.get_saldo() - valor);
			 if (super.get_saldo() < this.saldominimo)
				 this.saldominimo = super.get_saldo();
		 }
		 else
			 System.out.println("Saldo Insuficiente");
	}
	 
	 public void atualizar_saldo(){
		 super.set_saldo((super.get_saldo() + (this.saldominimo * 0.05)));
		 this.saldominimo = super.get_saldo();
	
	 }
	
	 public double get_saldominimo(){
		 return this.saldominimo;
	 }
	 
	 //@override
	 public String toString() {
		 return ("Conta: " + super.getNumero() + " Saldo: " + super.get_saldo() + " Saldo Mínimo: " + this.get_saldominimo());
	 }
}


