package com.biz.bank.exec;

import java.util.Scanner;

public class BankExec_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String strAccNum = "0001"; // 계좌넘버
		int intBalance = 100000; // 잔고 
		
		System.out.println("==============================");
		System.out.println("광한루 은행");
		System.out.println("==============================");
		System.out.println("1.조회2.입금3.출금0.종료");
		System.out.println("------------------------------");
		System.out.print("선택>>");
		String strMenu = scan.nextLine(); // mene system
		int intMenu = Integer.valueOf(strMenu);
		
		if(intMenu == 0) {
			System.out.println("업무종료");
			}else if(intMenu == 1) {
				System.out.println("계좌조회");
				/*
				 * 1.계좌번호를 입력받기
				 * 2.일치하는 계좌정보가 있으면
				 * 3.계좌내역을 보여주기
				 */
				System.out.print("계좌번호>>");
				String strAccKeyIn = scan.nextLine();
				if(strAccKeyIn.equals(strAccNum)) {
					System.out.println("==============================");
					System.out.printf("계좌번호 : %s\n",strAccNum);
					System.out.printf("잔고 : %d\n",intBalance);
					System.out.println("==============================");
				}else {
					System.out.println("계좌번호 없음");
				}
			}else if(intMenu == 2) {
				System.out.println("입금처리");
				/*
				 * 1.계좌번호 입력
				 * 2.계좌번호 일치 입금액 입력
				 * 3.계좌잔액 = 입금액 + 계좌잔액
				 */
				System.out.print("계좌번호>>");
				String strAccKeyIn = scan.nextLine();
				if(strAccKeyIn.equals(strAccNum)) {
					System.out.println("==============================");
					System.out.printf("계좌번호 : %s\n",strAccNum);
					System.out.printf("잔고 : %d\n",intBalance);
					System.out.println("==============================");
					System.out.print("입금액>>");
					String strInput = scan.nextLine();
					int intInput = Integer.valueOf(strInput);
					intBalance += intInput;
					System.out.printf("잔고 : %s\n",intBalance);
				}else {
					System.out.println("계좌번호 없음");
				}
			}else if(intMenu == 3) {
				System.out.println("출금처리");
				/*
				 * 1.계좌번호 입력
				 * 2.일치하면 출금금액 입력
				 * 3.잔액(잔고) > 출금금액이면 출금처리
				 * 4.잔액(잔고) < 출금금액이면 출금거부
				 */
				System.out.println("==============================");
				System.out.printf("계좌번호 : %s\n",strAccNum);
				System.out.printf("잔고 : %d\n",intBalance);
				System.out.println("==============================");
				System.out.print("출금액>>");
				String strOutput = scan.nextLine();
				int intOutput = Integer.valueOf(strOutput);
				if(intBalance >= intOutput) {
					intBalance-= intOutput;
				}else {
					System.out.println("잔고부족 출금불가");
				}
			}else {
				System.out.println("계좌번호 없음");
			}
			}
		
		
	}

