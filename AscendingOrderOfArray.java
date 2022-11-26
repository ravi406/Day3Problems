package ArrayPgms;

public class AscendingOrderOfArray {

	public static void main(String[] args) {
		int[] myIntArray = { 6, 3, 2, 7, 4 };
		int temp=0;
		System.out.print("Array Elements :");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + " ");
		}

		for (int i = 0; i < myIntArray.length; i++) {
			for (int j = i + 1; j < myIntArray.length; j++) {
					if (myIntArray[i]>myIntArray[j]) {
						temp=myIntArray[i];
						myIntArray[i]=myIntArray[j];
						myIntArray[j]=temp;
					}
			}
		}
		
		System.out.print("\nArray Elements in Ascending order :");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + " ");
		}

	}
}
