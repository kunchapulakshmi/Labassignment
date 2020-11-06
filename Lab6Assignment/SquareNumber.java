import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		int sqNum[] = { 4, 1, 8, 3, 7, 2 };
		Map<Integer, Integer> squareNum = getSquares(sqNum);
		System.out.println(squareNum);

	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {

		Map<Integer, Integer> squareMap = new HashMap<>();
		for (int square : sqNum) {
			squareMap.put(square, square * square);
		}
		return squareMap;
	}

}