import java.util.*;

public class HashMapSorted {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Sushma");
		hashMap.put(2, "Vishnu");
		hashMap.put(3, "Aruna");
		hashMap.put(4, "Pavan");
		List<String> sortedHashMap = new ArrayList<String>();
		sortedHashMap = getValues(hashMap);
		System.out.println(sortedHashMap);

	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {

		List<String> sortedHashMap = new ArrayList<String>();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);

		return sortedHashMap;
	}

}