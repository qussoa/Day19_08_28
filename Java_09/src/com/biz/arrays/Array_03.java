package com.biz.arrays;

import java.util.Random;

/*
 * 배열 요소의 정렬
 */
public class Array_03 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println("\n======================================");
		// 정렬하기 위해
		// 1. 배열의 개수만큼 반복문을 시작한다
		for (int i = 0; i < nums.length; i++) {

			// 2. 배열요소 i 번째와 i+1번째부터 length -1 번째까지 비교
			// 3. 큰 값을 오른쪽에 위치하도록 배열정렬

			for (int j = i + 1; j < nums.length; j++) {
				// i 왼쪽 j 오른쪽 위치를 나타내며 nums[i]가nums[j] 보다 크다는 것은
				// 왼쪽 값이 더 크다는 것이므로 i번째 값과 j번째 값을 서로 바꿔준다
				if (nums[i] > nums[j]) {

					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;

				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");

	}

}
}