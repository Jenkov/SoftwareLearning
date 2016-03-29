package c11;
class Weeble{}
public class ArraySize {

	public static void main(String[] args) {
		//Arrays of objects
		Weeble[] a;//Local uninitialized variable
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		for(int i=0;i<c.length;i++)
			if(c[i]==null)
				c[i] =new Weeble();
			Weeble[] d ={
					new Weeble(),new Weeble(),new Weeble()
			};
			
			//Dynamic aggregate initialization
			a = new Weeble[]{
					new Weeble(),new Weeble()
			};
			System.out.println("a.length="+a.length);
			System.out.println("b.length="+b.length);
			//The references inside the array are
			//automatically initialized to null
			for(int i = 0;i<b.length;i++)
				System.out.println("b["+i+"]="+b[i]);
			System.out.println("c.length="+c.length);
			System.out.println("d.length="+c.length);
			
			a = d;
			System.out.println("a.length="+a.length);
			
			//Arrays of primitives:
			int[] e; //Null reference
			int[] f =new int[5];
			int[] g = new int[4];
			for(int i =0;i<g.length;i++)
				g[i]=i*i;
			int[] h ={11,47,93};
			//Compile error:variable e not initialized:
			//!System.out.pritnln("e.length="+e.length);
			System.out.println("f.length="+f.length);
			//The primitives inside the array are 
			//automatically initialized to zero
			for(int i=0;i<f.length;i++)
				System.out.println("f["+i+"]="+f[i]);
			System.out.println("g.length="+g.length);
			System.out.println("h.length="+h.length);
			e = h;
			System.out.println("e.length="+e.length);
			e =  new int[]{1,2};
			System.out.println("e.length="+e.length);

		}	
			
	}


