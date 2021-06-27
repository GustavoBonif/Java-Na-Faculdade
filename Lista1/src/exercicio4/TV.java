package exercicio4;

public class TV {
	private int canal, volume;
	
	public TV(int cn, int vol) {
		this.canal = cn;
		this.volume = vol;
	}
	
	public void setCanal(int cn) {
		if(cn >= 1 && cn <= 1000) {
			this.canal = cn;
			System.out.println("O canal foi trocado");
		}else
			System.out.println("O canal � inexistente");
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void aumentarVolume() {
		if(this.volume < 100) 
			this.volume++;
		else
			System.out.println("Volume m�ximo");
	}
	
	public void diminuirVolume() {
		if(this.volume > 0)
			this.volume--;
		else 
			System.out.println("J� est� sem som");
	}
	
	public int getVolume() {
		return this.volume;
	}
}
