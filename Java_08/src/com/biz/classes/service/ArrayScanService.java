package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {

	private int[] nums;

	// 생성자 method :
	// 클래스에 포함되는 method 중에 void 등이 없고 클래스 이름과 같은 method
	// 누군가 new ArrayScanService() 생성자 메서드를 호출할 때 자동으로 호출되는 method
	public ArrayScanService(int length) {

		Random rnd = new Random();
		nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}

	}

	public void scanArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("0~10까지 정수 : ");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);

		int index;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == intNum)
				break;
		}
		if (index >= nums.length)
			System.out.println("없음");
		else
			System.out.printf("%d번째 찾음\n", index);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	
		scanner.close();
	
	}// scannArray End
	
	public void scanArrayAll() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("1~10까지 정수 : ");
		 String strNum = scanner.nextLine();
		 int intNum =  Integer.valueOf(strNum);
		 
		 int nCount = 0;
		 for (int i = 0; i <nums.length; i ++) {
			 if(nums[i] == intNum)
		 }
						
				int index;
				for (index = 0; index < nums.length; index++) {
			 
		 }
		 if(nCount < 1) {
			 System.out.println("찾지 못함");
		 } else {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + ", ");
			}
		System.out.println();
			//scanner.close();
		 }
	

