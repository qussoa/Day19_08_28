package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodProtoType;

public class Method_03 {

	public static void main(String[] args) {

		MethodProtoType mt = new MethodProtoType();
		
		
		mt.view();
		int n = mt.ret();
		mt.mret(30,40);
		int m = mt.mret(50,30);
	}

}
