package interfaces;
interface Cycle{
	void doSomething();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void doSomething(){
		System.out.println("Unicycle");
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}
class Bicycle implements Cycle{
	public void doSomething(){
		System.out.println("Bicycle");
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}
class Tricycle implements Cycle{
	public void doSomething(){
		System.out.println("Tricycle");
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}
public class Cycles {
	public static void showCycle(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.doSomething();
	}
	public static void main(String[] args){
		showCycle(new BicycleFactory());
		showCycle(new TricycleFactory());
		showCycle(new UnicycleFactory());
	}
}
