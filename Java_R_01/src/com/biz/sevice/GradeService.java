package com.biz.sevice;

import java.util.Random;

import com.biz.rev.GradeVO;

public class GradeService {

	public static void main(String[] args) {
		GradeVO[] gs = new GradeVO[5];
		
		int intKor = 94;
		int intEng = 55;
		int intMath = 44;
		
		intKor = gs[1].intKor;
		intEng = gs[1].intEng;
		intMath = gs[1].intMath;
		
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		
		
		System.out.println(sum);
	}

	
	
}
