
public class Money {
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
				getClass().equals(money.getClass());
	}
	
	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
	
	protected int amount;
}
