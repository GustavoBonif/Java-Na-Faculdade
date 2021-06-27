public class CEspecial extends CCorrente {
	 private int limite;
	
	 public CEspecial(int num, double sal, int lim) {
		 super(num, sal);
		 this.limite = lim;
	 }
	
	 @Override
	 public void debitar(double valor){
		 if (valor <=(super.get_saldo() + this.limite)){
			 super.set_saldo(super.get_saldo() - valor);
		 }
		 else{
			 System.out.println("Saldo Insuficiente");
		 }
	 }
	 
	//@override
	public String toString() {
		return (super.toString() + " Limite: " + this.limite);
	}
}