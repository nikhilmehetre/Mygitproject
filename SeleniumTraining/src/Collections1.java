import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> names = new ArrayList<String>();
		LinkedList<String> names = new LinkedList<String> ();
		names.add("Nikhil");
		names.add("Rhythm");
		names.add("Rhythm");
		names.add("Rhythm");
		names.add("Jyotsna");
		names.add("Mehetre");
		names.add("Maverick");
		
		System.out.println(names.size());
		System.out.println(names.get(2));
		names.remove(2);
		names.add("Hriyan");
		System.out.println(names.get(3));
		System.out.println("iterator--->");
		for (Iterator<String> count = names.iterator(); count.hasNext();) {
			String name = (String) count.next();
			System.out.println(name);
		}
		
	}

}
