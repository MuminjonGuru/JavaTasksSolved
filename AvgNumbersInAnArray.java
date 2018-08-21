package averageNumbersInAnArray;

public class AverageNumbersInAnArray {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 3, 3 };
		int s = 0, avg = 0;

		for (int element : arr) {
			s += element;
		}

		avg = s / arr.length;
		System.out.println("Avg: " + avg);
	}

}
