package stack;

public class Stackfile {
	String arr[]=new String[10];
	int index;
	
	public void Stackfile()
	{
		index=-1;
		
	}
	
	public void push(String rec) {
		arr[++index]=rec;
	}
	
	public String pop() {
		return arr[index--];
	}
}
