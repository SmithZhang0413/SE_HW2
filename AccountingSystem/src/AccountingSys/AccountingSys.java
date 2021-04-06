package AccountingSys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
 
public class AccountingSys implements AccountingSysInterface {
	private LinkedList<Account> accounts = new LinkedList<Account>();
	//check ID 
	private boolean checkID(String ID) {
		return true;
	}
	//read input
	  public static void readInput() {
	       File file = new File("./input.txt");
	       BufferedReader reader = null;
        try {
        	System.out.println("以行为单位读取文件内容，一次读一整行：");
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        int line = 1;
	        while ((tempString = reader.readLine()) != null) {
	        // 显示行号
	        System.out.println("line " + line + ": " + tempString);
	             line++;
	        }
	        reader.close();
        } catch (IOException e) {
	         e.printStackTrace();
	    } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	    }
	//show total expenses
	public void showTotalExpenses(String ID) {
		
	}
	//show all transactions
	public void showTransactions(String ID) {
		
	}
	//show expenses on a specific day
	public void showExpensesDay(String ID, String date) {
		
	}
	//show daily average expenses on a specific month
	public void showDailyAverage(String ID, String month) {
		
	}
	
	public static void main(String[] args) { 
		readInput();
	}
}
