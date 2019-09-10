package com.biz.string.exec;

public class Payment01 {

	public static void main(String[] args) {

		int pay = 3785870;
		int unit = 50000;
		int num = 0;
		int sw = 0;
		while(true) {
			num = pay/unit;
			System.out.println(unit + "원" + num + "매수");
			if(unit <= 1) {
				break;
			}
			pay = pay-unit*num;
			if(sw == 0) {
				unit = unit/5;
				sw = 1;
				}else {
					unit = unit/2;
					sw = 0;
				}
			
		}
		
	
	
		


	}

}
