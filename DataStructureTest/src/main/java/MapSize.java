import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapSize {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Ajit");
		map.put(2, "Ajit");
		map.put(3, "Ajit");
		map.put(4, "Ajit");
		
		try {
			for(Map.Entry<Integer, String> mp:map.entrySet())
			{
				map.remove(2);
				System.exit(0);
			}
		}
		finally{
			System.out.println("Finally");
		}
	}

}
