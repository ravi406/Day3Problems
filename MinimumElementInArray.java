package ArrayPgms;

public class MinimumElementInArray {

	public static void main(String[] args) {
		int[] myIntArray = { 9, 4, 8, 5, 7 };
		int minimum = myIntArray[0];

		System.out.print("Array Elements:");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + " ");

		}

		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] < minimum) {
				minimum = myIntArray[i];
			}
		}

		System.out.println("\nMinimum element is :" + minimum);

	}

}
