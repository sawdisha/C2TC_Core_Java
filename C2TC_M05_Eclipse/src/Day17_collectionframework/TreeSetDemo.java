package Day17_collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Hash");
		ts.add("Set");
		ts.add("Pavan");
		ts.add("Demo");
		ts.add("Demo");
		
		Iterator j=ts.iterator();
		while(j.hasNext())
		{
			Object p=j.next();
			System.out.println(p);
		}


	}

}
