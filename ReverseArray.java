package ArrayPgms;

public class ReverseArray {

	public static void main(String[] args) {

		int[] myIntArray = { 10, 20, 30, 40, 50 };

		int n = myIntArray.length - 1;

		System.out.println("Array Elements Before Reversing");

		for (int i = 0; i <= n; i++) {
			System.out.print(myIntArray[i] + " ");
		}

		System.out.println("\nArray Elements After Reversing");

		for (int i = n; i >= 0; i--) {
			System.out.print(myIntArray[i] + " ");
		}
	}
}
