package Section3;

import java.util.Arrays;

public class c1test {

	public static void main(String[] args) {
		// 1. ��ĥ �迭 2�� �غ�
		int[] arr1 = { 1, 2, 8 };
		int[] arr2 = { 4, 5 };
		// 2. 2�� �迭�� �� ����
		int destLength = arr1.length + arr2.length;
		// 3. ��� �迭 �غ�(�� ���̴� arr1�� ���� + arr2�� ����)
		int[] dest = new int[destLength];
		// 4. �迭 ��ġ��
		// 4.1 arr1�� dest�� ���� (index 0 ~ index 2)
		System.arraycopy(arr1, 0, dest, 0, arr1.length);
		// 4.2 arr2�� dest�� ���� (index 3 ~ index 5)
		System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);
		// 5. ��� ���
		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5]
	}


}
