package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class Dealer implements Player {

	private List<CardVO> deckList;
	private static final int CAN_RECEIVE_VALUE = 16;
	private static final String NAME = "DEALER";
	
	private boolean turn;

	public Dealer() {

		deckList = new ArrayList<>();
	}

	@Override
	public void receiveCard(CardVO cardVO) {
		if (this.isReceivedCard()) {
			this.deckList.add(cardVO);

		} else {
			System.out.println("17이상 받을 수 없음");
		}

	}

	@Override
	public void showCards() {
		System.out.println("----------------------------");
		System.out.println("DEALER");
		System.out.println("----------------------------");
		for (CardVO cVO : deckList) {
			System.out.print(cVO.getPatten() + "\t");
			System.out.println(cVO.getDenomination());
		}
	}

	@Override
	public List<CardVO> openCards() {
		return this.deckList;
	}

	private boolean isReceivedCard() {
		return getValueSum() <= CAN_RECEIVE_VALUE;
	}

	private int getValueSum() {
		int sum = 0;
		for (CardVO cardVO : deckList) {
			sum += cardVO.getValue();
		}
		return sum;
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
		return NAME;
	}


}
