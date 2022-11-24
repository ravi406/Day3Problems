package ArrayPgms;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] myIntArray = { 10, 3, 9, 6, 5 };

		int max = myIntArray[0];

		System.out.print("Array Elements:");
		for (int i = 0; i < myIntArray.length; i++) {

			System.out.print(myIntArray[i] + " ");

		}

		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] > max) {
				max = myIntArray[i];
			}
		}

		System.out.println("\nLargest element is " + max);
	}

}
