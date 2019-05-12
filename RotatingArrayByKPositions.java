public class RotatingAnArrayByKPositions {
	
	public static void reverseArray(int[] a, int start, int end) {
		for(int i = start, j = end; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	public static void rotateArray(int[] a, int n, int k) {
		reverseArray(a, 0, k-1);
		reverseArray(a, k, n-1);
		reverseArray(a, 0, n-1);
	}

	public static void main(String[] args) {
			// your code goes here

	}

}
