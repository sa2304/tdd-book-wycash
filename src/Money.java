
abstract class Money {
	abstract Money times(int multiplier);
	
	public String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
				getClass().equals(money.getClass());
	}
	
	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
	
	static Franc franc(int amount) {
		return new Franc(amount);
	}
	
	protected int amount;
	protected String currency;
}
