/*
 * P218Á·Ï°1
 */
package holding;

import java.util.ArrayList;

class Gerbil{
	private static int gerbilNumber;
	private final int id = gerbilNumber++;
	
	public int id(){
		return id;
	}
	public void hop(){
		System.out.println("Gerbil#"+id()+"is hoping");
	}
}
public class GerbilsWithGenerics {

	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i=0;i<3;i++)
			gerbils.add(new Gerbil());
		for(int i=0;i<gerbils.size();i++)
			gerbils.get(i).hop();

	}

}
