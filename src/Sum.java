
public class Sum implements Expression {
	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}
	
	Money augend;
	Money addend;
}
