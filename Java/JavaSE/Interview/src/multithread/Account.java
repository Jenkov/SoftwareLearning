package multithread;

public class Account {
	private double balance;	//�˻����
	public void deposit(double money){
		double newBalance = balance + money;
		try{
			Thread.sleep(10);//ģ���ҵ����Ҫһ��ʱ��
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		balance = newBalance;
	}
	/*
	 * ��ȡ�˻����
	 */
	public double getBalance(){
		return balance;
	}
}
