package com.biz.arrays.exec.member;

import com.biz.arrays.service.MemberService;

public class MemberEx_03 {

	public static void main(String[] args) {

		MemberService ms1 = new MemberService();
		MemberService ms2 = new MemberService(15);
		
		System.out.println("ms1");
		ms1.memberListView();
		System.out.println("ms2");
		ms2.memberListView();
	}

}
