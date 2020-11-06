import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		Integer numArray[] = { 12, 94, 15, 32, 93, 17 };
		int secondSmallestElement = getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : " + secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] numArray) {
		List<Integer> element = Arrays.asList(numArray);
		Collections.sort(element);
		System.out.println("Sorting Array\n" + element);
		Integer secondSmallest = element.get(1);
		return secondSmallest;
	}

}