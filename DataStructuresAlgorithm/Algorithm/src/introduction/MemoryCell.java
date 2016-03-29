package introduction;
//MemoryCell class 
//Object read()		--->Returns the stored value
//void write(Object x)	-->x is stored

public class MemoryCell {
	//Public Methods
	public Object read(){
		return storedValue;
	}
	public void write(Object x){
		storedValue = x;
	}
	
	private Object storedValue;
}
