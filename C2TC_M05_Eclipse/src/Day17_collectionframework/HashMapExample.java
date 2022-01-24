package Day17_collectionframework;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//Creating Hashmap
		map.put(1, "Mango");//Put elements in the Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(null, null);
		map.put(null, "Berry");
		map.put(5, null);
		//map.put(4, "Orange");//Hashmap overwrites existing value in case of duplicate key
		
		System.out.println("Iterating Hashmap...");
		
		//for each loop
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
