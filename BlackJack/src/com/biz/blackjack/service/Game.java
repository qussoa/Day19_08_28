package com.biz.blackjack.service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.biz.blackjack.domain.CardVO;

public class Game {

	private static final int INIT_RECEIVE_CARD_COUNT = 2;
	private static final String STOP_RECEIVE_CARD = "0";

	List<Player> players;

	public void paly() {
		System.out.println("=========BlackJack=========");
		Scanner scan = new Scanner(System.in);
		CardDeck cardDeck = new CardDeck();
		Rule rule = new Rule();

		List<Player> players = Arrays.asList(new Gamer("GAMER"), new Dealer());
		List<Player> initAfterPlayers = initPhase(cardDeck, players);
		List<Player> playingAfterPlayers = playingphase(scan, cardDeck, initAfterPlayers);

		Player winner = rule.getWinner(playingAfterPlayers);

		System.out.println("The Winner is " + winner.getName());
	}

	private List<Player> playingphase(Scanner scan, CardDeck cardDeck, List<Player> players) {
	
		List<Player> cardRecivedPlayers;
		while (true) {
			
			cardRecivedPlayers = receivedCardAllPlayers(scan, cardDeck, players);

			if (isAllPlayerTurnOff(cardRecivedPlayers)) {
				break;
			}
		}
		return cardRecivedPlayers;
	}

	private List<Player> receivedCardAllPlayers(Scanner scan, CardDeck cardDeck, List<Player> players) {

		for (Player player : players) {
			System.out.println(player.getName()+" 차례입니다");
			if (isReceiveCard(scan)) {
				CardVO cardVO = cardDeck.draw();
				player.receiveCard(cardVO);
				player.turnOn();
			} else {
				player.turnOff();
			}
		}
		return players;
	}

	private boolean isAllPlayerTurnOff(List<Player> players) {
		for(Player player : players) {
			if(player.isTurn()) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isReceiveCard(Scanner scan) {
		System.out.println("카드를 뽑겠습니까? 종료(0)");
		return !STOP_RECEIVE_CARD.equals(scan.nextLine());
	}

	private List<Player> initPhase(CardDeck cardDeck, List<Player> players) {
		System.out.println("2장으로 시작합니다");
		for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
			for (Player player : players) {
				CardVO cardVO = cardDeck.draw();
				player.receiveCard(cardVO);
			}

		}
		return players;
	}
}
