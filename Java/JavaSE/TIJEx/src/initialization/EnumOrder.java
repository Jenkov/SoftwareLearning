package initialization;
enum Coin{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}
public class EnumOrder {
	public static void main(String[] args){
		for(Coin c:Coin.values()){
			System.out.println("Coin "+c.ordinal()+":"+c);
		}
	}
}
