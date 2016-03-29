package multithread;

public class AddMoneyThread implements Runnable{
	private Account account;	//��Ǯ���˻�
	private double money;	//�����Ǯ
	public AddMoneyThread(Account account,double money){
		this.account = account;
		this.money = money;
	}
	@Override
	public void run(){
		account.deposit(money);
	}
}
