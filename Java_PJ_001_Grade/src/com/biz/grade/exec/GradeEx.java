package com.biz.grade.exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;
import com.biz.grade.service.TotalService;
import com.biz.grade.service.TotalServiceImp;

public class GradeEx {
public static void main(String[] args) {
	//GradeService gs = new GradeServiceImp();
	//ScoreService ss = new ScoreServiceImp();
	//gs.input(2);
	//gs.list();
	
	//ss.input(3);
	//ss.total();
	//ss.list();
	
	TotalService ts = new TotalServiceImp();
	
	ts.input(2);
	ts.view();
}
}
