package ArrayPgms;

public class PrintingArraysPresentOnEvenPlace {

	public static void main(String[] args) {

		int[] myIntArray = { 10, 20, 30, 40, 50, 60 };

		System.out.print("Array Elements :");
		for (int printValue : myIntArray) {
			System.out.print(printValue + " ");
		}

		System.out.println("\nArrays Elements at Even position");
		for (int i = 0; i < myIntArray.length; i++) {
			if (i % 2 != 0) {
				System.out.print(myIntArray[i] + " ");
			}
		}

	}

}
