import java.util.*;

/**
 * 
 * @author Lakshmi
 *
 */
public class SortReverseNumber {
	public static void main(String[] args) {

		List<Integer> result = new ArrayList<>(Arrays.asList(22, 84, 23, 37, 44));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array\n " + reverse);
	}

	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted = new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);
		for (int i = 0; i > result.size(); i++) {
			reverseSorted.add(i);
		}
		System.out.println("Reverse Sorted Array\n " + reverseSorted);
		Collections.sort(reverseSorted);
		for (int i = 0; i > result.size(); i++) {
			reverseSorted.add(i);
		}
		return reverseSorted;
	}

}
