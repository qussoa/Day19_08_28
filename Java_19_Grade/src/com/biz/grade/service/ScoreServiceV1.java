package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.biz.grade.domain.ScoreVO;

public class ScoreServiceV1 {

	Map<String, ScoreVO> scList;

	public ScoreServiceV1() {
		scList = new HashMap<String, ScoreVO>();
	}

	public void read(String scoreFileName) throws IOException {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(scoreFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
		}
	}
}
