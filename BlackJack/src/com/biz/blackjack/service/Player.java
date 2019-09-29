package com.biz.blackjack.service;

import java.util.List;

import com.biz.blackjack.domain.CardVO;

public interface Player {

	String getName();
	void receiveCard(CardVO cardVO);

	void showCards();

	List<CardVO> openCards();

	void turnOff();

	void turnOn();

	boolean isTurn();

}
