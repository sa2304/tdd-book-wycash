
public class Dollar {
	Dollar(int amount) {
		this.amount = amount;
	}
	
	void times(int multiplier) {
		this.amount *= multiplier;
	}
	
	int amount;
}
