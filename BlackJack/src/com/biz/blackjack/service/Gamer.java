package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.blackjack.domain.CardVO;

public class Gamer implements Player {

	private List<CardVO> deckList;
	private boolean turn;
	private String name =null;

	
	public Gamer(String name) {
		deckList = new ArrayList();
		this.name = name;
	}

	@Override
	public void showCards() {
		System.out.println("-------------------------");
		System.out.println("GAMER");
		System.out.println("-------------------------");
		for(CardVO cardVO : deckList) {
			System.out.print(cardVO.getPatten()+"\t");
			System.out.println(cardVO.getDenomination());
		}
	}

	@Override
	public void receiveCard(CardVO cardVO) {
		this.deckList.add(cardVO);
		this.showCards();
	}

	@Override
	public List<CardVO> openCards() {
		return this.deckList;
	}

	@Override
	public void turnOff() {
				this.setTurn(false);
	}

	@Override
	public void turnOn() {
		this.setTurn(true);
	}

	@Override
	public boolean isTurn() {
		return this.turn;
	}

	private void setTurn(boolean turn) {
		this.turn = turn;
	}

	@Override
	public String getName() {
		return this.name;
	}


}
