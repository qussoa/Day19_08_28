package com.biz.arrays.exec.member;

import com.biz.arrays.model.MemberVO;
import com.biz.arrays.service.MemberService;

public class MemberEx_01 {

	public static void main(String[] args) {

		// ms 객체를 생성하는 코드가 실행되면 
		// MemberService의 생성자 method가 호출되어 실행
		
		// 생성자 코드가 실행되면 MemberVO  객체가 10개 생성되고 
		//이름 멤버변수가 세팅된 상태로 존재하게 된다
		
		MemberService ms = new MemberService();
		
		// MemberService에서 MemberVO 배열에서 읽어와서 연산을 수행
		
		MemberVO[] mVOs = ms.getMemberVO();
		for(int i = 0; i < mVOs.length; i++) {
			System.out.println(mVOs[i].strName); 
		}
		
	}

}
