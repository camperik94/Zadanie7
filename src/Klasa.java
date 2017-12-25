
public class Klasa {
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public Klasa(int number) {
		this.number = number;
	}
	
	public void metoda() {
		for(int i = 0; i <= number; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
