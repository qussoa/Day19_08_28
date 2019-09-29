package com.biz.blackjack.service;

import java.util.LinkedList;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class CardDeck {

	List<CardVO> deckList;

	public static final String[] PATTENS = { "Diamond◆", "Heart♥", "Spade♠", "clover♣" };
	public static final int denomination = 13;

	public CardDeck() {
		deckList = this.generateCards();

	}// CardDeck end

	private List<CardVO> generateCards() {
		List<CardVO> deckList = new LinkedList<>();

		for (String pattern : PATTENS) {
			for (int i = 1; i <= denomination; i++) {
				CardVO cardVO = new CardVO(pattern, i);
				deckList.add(cardVO);

			}
		}
		return deckList;
	}

	public CardVO draw() {
		CardVO selectedCard = getRandomCard();
		deckList.remove(selectedCard);
		return selectedCard;

	}

	private CardVO getRandomCard() {
		int size = deckList.size();
		int select = (int) (Math.random() * size);
		return deckList.get(select);
	}

	public void viewCardList() {
		for (CardVO vo : deckList) {
			System.out.println(vo.toString());
		}
		System.out.println("=============");
		System.out.println("카드 매수 : " + deckList.size());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (CardVO cardVO : deckList) {
			sb.append(cardVO.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

}
