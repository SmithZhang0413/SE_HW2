package AccountingSys;

import java.util.LinkedList;
//import java.util.Queue;



public abstract class Account {
	private String ID;
	
	public Account(String ID) {
		this.ID = ID;
	}
	
	private LinkedList<Transaction> transactions = new LinkedList<Transaction>();
	 
	
	public void insert(String date, int expense) {
		Transaction tempTran = new Transaction(date, expense);
		transactions.sort(null);
		transactions.add(tempTran);
	}
	
}
