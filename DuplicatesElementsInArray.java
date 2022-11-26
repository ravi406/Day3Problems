package ArrayPgms;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {
		int[] myIntArray = { 2, 3, 2, 4, 5, 6, 7, 5, 8 };

		for (int printArray : myIntArray) {
			System.out.print(printArray + " ");
		}

		System.out.println("\nDuplicate Elements in an Array are : ");
		for (int i = 0; i < myIntArray.length; i++) {
			for (int j = i + 1; j < myIntArray.length; j++) {
				if (myIntArray[i] == myIntArray[j]) {
					System.out.print(myIntArray[i] + " ");
				}
			}
		}
	}
}
