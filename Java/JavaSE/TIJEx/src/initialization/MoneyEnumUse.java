/*
 * P107
 * ��ϰ21
 */
package initialization;

public class MoneyEnumUse {

	public static void main(String[] args) {
		for(MoneyEnum m:MoneyEnum.values())
			System.out.println(m+".ordinal is "+m.ordinal());

	}

}
