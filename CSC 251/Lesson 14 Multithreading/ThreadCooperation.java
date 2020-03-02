import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ThreadCooperation {
	
	private static Account account = new Account();
	
	public static void main(String[] args) {
	
		int depositor = Integer.parseInt(args[0]);
		int withdrawer = Integer.parseInt(args[1]);
		int totalThreads = depositor + withdrawer;
		ExecutorService executor = Executors.newFixedThreadPool(totalThreads);
		
		for (int i = 0; i < depositor; i++) {
			executor.execute(new DepositTask());
		}
		
		for (int i = 0; i < withdrawer; i++) {
			executor.execute(new WithdrawTask());
		}
	}
	
	public static class DepositTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				account.deposit((int)(Math.random() * 10) +1);
			}
		}
	}
	
	public static class WithdrawTask implements Runnable {

		@Override
		public void run() {
			while (true) {
				account.withdraw((int)(Math.random()*10) +1);
			}
		}	
	}
	
	public static class Account {
		
		private static Lock lock = new ReentrantLock();
		
		private static Condition newDeposit = lock.newCondition();
		
		private int balance = 0;
		private int maxAccount = 49;
		
		public int getBalance() {
			return balance;
		}
		
		public void withdraw(int amount) {
			lock.lock();
			try {
				while (balance < amount) {
					System.out.println("\t\t\tWait for a deposit");
					newDeposit.await();
				}
				balance -= amount;
				System.out.println("\t\t\tWithdraw " + amount + "\t\t" + getBalance());
				newDeposit.signalAll();
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			finally {
				lock.unlock();
			}
		}
		
		public void deposit(int amount) {
			lock.lock();
			try {
				while (balance + amount > maxAccount) {
					System.out.println("\t\t\tWait for a withdrawal");
					newDeposit.await();
				}
				balance += amount;
				System.out.println("Deposit " + amount + "\t\t\t\t\t" + getBalance());
				newDeposit.signalAll();
				
				
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			finally {
				lock.unlock();
			}
		}
	}

}
