package reverseArr;

import java.util.Arrays;

public class ReverseArr_2 {
	public int[] reverseArr(int[] arr) {

		if (arr.length == 0)
			return arr;

		int[] head = new int[]{arr[arr.length - 1]};
		int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));
		int[] result = new int[head.length + tail.length];
		System.arraycopy(head, 0, result, 0, head.length);
		System.arraycopy(tail, 0, result, 1, tail.length);

		return result;
	}
}
