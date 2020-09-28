package javaPractice;
import java.util.*; 
class I 
{ 
	public static void main (String[] args) 
	{ 
		//Object i = new ArrayList().iterator();
		//Object i = new ArrayList();
		Object i = new ArrayList().listIterator();
		System.out.print((i instanceof List) + ", "); 
		System.out.print((i instanceof Iterator) + ", "); 
		System.out.print(i instanceof ListIterator); 
	} 
} 
