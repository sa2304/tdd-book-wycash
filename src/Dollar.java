
public class Dollar {
	Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		this.amount *= multiplier;
		return null;
	}
	
	int amount;
}
