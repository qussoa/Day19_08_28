package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class ScoreEx_03 {

	public static void main(String[] args) {

		StringService stdService = new StudentServiceV1();
		
		//학생정보
		stdService.input();
		//stdService에서 stdList 추출
		List<StudentVO> stdList = ((StudentServiceV1)stdService).getScoreList();
		
		// stdList에서 ScoreService에 주입
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		//점수
		scService.input();
		scService.list();
		
	}

}
