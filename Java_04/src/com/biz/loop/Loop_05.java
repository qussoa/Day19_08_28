package com.biz.loop;

public class Loop_05 {

	public static void main(String[] args) {

		int nCount = 0;
		for (; nCount < 10;) {
			System.out.printf("%d x %d = %d\n ",3,++nCount,nCount*3);
		}
	}

}
