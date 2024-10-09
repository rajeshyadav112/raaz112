package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Demo {

	public static void main(String[] args) {
	Collection<Integer>	c=new ArrayList<Integer>();
	c.add(10);
	c.add(30);
	
	Iterator<Integer> itr = c.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
     c.remove(10);
     System.out.println(c);
     
     c.removeAll(c);
     System.out.println(c);
     c.retainAll(c);
     System.out.println(c);
	}

}
