package stack;

public class Stackdemo {
	
	public static void main(String args[]) {
		Stackfile st=new Stackfile();
		st.push("Jeya");
		st.push("Je");
		st.push("America");
		
	    
		System.out.println(st.pop());
		st.push("family");
		System.out.println(st.pop());
	}
}
