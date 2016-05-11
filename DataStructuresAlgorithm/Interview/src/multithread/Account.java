package multithread;

public class Account {
	private double balance;	//账户余额
	public void deposit(double money){
		double newBalance = balance + money;
		try{
			Thread.sleep(10);//模拟此业务需要一段时间
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		balance = newBalance;
	}
	/*
	 * 获取账户余额
	 */
	public double getBalance(){
		return balance;
	}
}
