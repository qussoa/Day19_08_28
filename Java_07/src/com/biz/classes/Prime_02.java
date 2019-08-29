package com.biz.classes;

import java.util.Scanner;

public class Prime_02 {

	public static void main(String[] args) {

		PrimeService pService = new PrimeService();

		Scanner scanner = new Scanner(System.in);

		/*
		 * 키보드로 숫자를 입력받아서 입력한 숫자가 -1이면 게임을 종료하고
		 * 그렇지 않으면 입력한 숫자를 PrimeService.checkPrime()에 보내
		 * 소수인지 판별하는 게임
		 */
		while (true) {
			
			System.out.print("숫자 (-1 : 종료)  ");
			String strNum = scanner.nextLine();
			int num = Integer.valueOf(strNum);
	
			if(num<0) break;
			pService.checkPrime(num);
			System.out.println("================");
			
		}

		
		System.out.println(" ^GAME오OVER^ ");
		
	}

}
