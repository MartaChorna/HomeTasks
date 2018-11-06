package pack2;

import java.util.Arrays;
import java.util.HashSet;

public class SecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = { 13, 7, 9, 7, 6, 14, 7 };
		System.out.println("Array without reverse: " + Arrays.toString(digits));
		reverseArray(digits);
	}

	public static void reverseArray(int[] digits) {
		for (int left = 0, right = digits.length - 1; left < right; left++, right--) {
			// swap the values at the left and right indices
			int temp = digits[left];
			digits[left] = digits[right];
			digits[right] = temp;
		}

		System.out.print("Reversed Array: ");

		for (int val : digits) {
			System.out.print(" " + val);
		}

		HashSet<Integer> digits1 = new HashSet<Integer>();

		for (int i = 0; i < digits.length; i++) {
			digits1.add(digits[i]);
		}

		System.out.println("\n"+ "Array without duplicates: " + digits1);
	}
}

