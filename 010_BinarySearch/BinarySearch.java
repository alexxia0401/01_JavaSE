public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[]{-98, -76, -36, 0, 23, 56, 58, 66, 101};
		int target = 23;
		int start = 0;
		int end = arr.length - 1;
		boolean notFound = true;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			if (target == arr[middle] ) {
				System.out.println("Found number, index is " + middle);
				notFound = false;
				break;
			} else if (target < arr[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		
		if (notFound) {
			System.out.println("Didn't find number.");
		}

	}

}
