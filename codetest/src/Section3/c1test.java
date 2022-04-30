package Section3;

import java.util.Arrays;

public class c1test {

	public static void main(String[] args) {
		// 1. 합칠 배열 2개 준비
		int[] arr1 = { 1, 2, 8 };
		int[] arr2 = { 4, 5 };
		// 2. 2개 배열의 총 길이
		int destLength = arr1.length + arr2.length;
		// 3. 결과 배열 준비(총 길이는 arr1의 길이 + arr2의 길이)
		int[] dest = new int[destLength];
		// 4. 배열 합치기
		// 4.1 arr1을 dest로 복사 (index 0 ~ index 2)
		System.arraycopy(arr1, 0, dest, 0, arr1.length);
		// 4.2 arr2를 dest로 복사 (index 3 ~ index 5)
		System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);
		// 5. 결과 출력
		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5]
	}


}
