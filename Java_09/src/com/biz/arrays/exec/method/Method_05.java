package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class Method_05 {

	public static void main(String[] args) {

		MethodService ms = new MethodService();
		
	
		ms.add();
		ms.add(100);
		ms.add(30,40);
		ms.add(30.0f,40.0f);
	
	}

}
