
class Money {
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return null;
	}
	
	public String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
				currency().equals(money.currency());
	}
	
	static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
	protected int amount;
	protected String currency;
}
