package AccountingSys;

public class Transaction {
	
	private String date;
	private int expense;
	public Transaction(String date, int expense) {
		this.date = date;
		this.expense = expense;
	}
	public String getDate() {
		return this.date;
	}
	public int getExpense() {
		return this.expense;
	}
	
}
