package Sets;

public class Dample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, -1, 3, 10, 20, -10, 0, 4 };
		int n = arr.length;
		int sum = 10;
		Dample.subArraySum(arr, n, sum);
	}

	static int subArraySum(int arr[], int n, int sum) {
		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = arr[i];

			// try all subarrays starting with 'i'
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					System.out.printf("Sum found between indexes %d and %d", arr[i], arr[j]);
					return 1;
				}
				if (curr_sum > sum || j == n)
					break;
				curr_sum = curr_sum + arr[j];
			}
		}

		System.out.printf("No subarray found");
		return 0;
	}

}
