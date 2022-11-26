package ArrayPgms;

public class PrintArrayElementsOnOddPosition {

	public static void main(String[] args) {

		int[] myIntArray = { 21, 22, 23, 24, 25, 26, 27, 28 };

		System.out.print("Array Elements :");
		for (int printValue : myIntArray) {
			System.out.print(printValue + " ");
		}

		System.out.print("\nArrays Elements at odd position :");
		for (int i = 0; i < myIntArray.length; i++) {
			if (i % 2 == 0) {
				System.out.print(myIntArray[i] + " ");
			}
		}

	}

}
