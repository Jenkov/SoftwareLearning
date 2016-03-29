package multithread;

public class AddMoneyThread implements Runnable{
	private Account account;	//´æÇ®µÄÕË»§
	private double money;	//Óû´æµÄÇ®
	public AddMoneyThread(Account account,double money){
		this.account = account;
		this.money = money;
	}
	@Override
	public void run(){
		account.deposit(money);
	}
}
