package initialization;

public class MoneyEnumDescribe {

	MoneyEnum me;
	public MoneyEnumDescribe(MoneyEnum me){
		this.me = me;
	}
	public void describe(){
		switch(me){
		case YI:
			System.out.println("YI YUAN");
			break;
		case ER:
			System.out.println("ER YUAN");
			break;
		case WU:
			System.out.println("WU YUAN");
			break;
		case SHI:
			System.out.println("SHI YUAN");
			break;
		case ERSHI:
			System.out.println("ERSHI YUAN");
			break;
		case WUSHI:
			System.out.println("WUSHI YUAN");
			break;
		case YIBAI:
			System.out.println("YIBAI YUAN");
			break;
		}
	}
	public static void main(String[] args) {
		MoneyEnumDescribe
		wushi = new MoneyEnumDescribe(MoneyEnum.WUSHI),
		yibai = new MoneyEnumDescribe(MoneyEnum.YIBAI);
		
		wushi.describe();
		yibai.describe();
		
				
	}

}
