package AccountingSys;

public interface AccountingSysInterface {
	//show total expenses
	public void showTotalExpenses(String ID);
	//show all transactions
	public void showTransactions(String ID);
	//show expenses on a specific day
	public void showExpensesDay(String ID,String date);
	//show daily average expenses on a specific month
	public void showDailyAverage(String ID, String month);
}
