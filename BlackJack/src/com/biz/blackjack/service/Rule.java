package com.biz.blackjack.service;

import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class Rule {

	public int getValueSum(List<CardVO> deckList) {
	
		int sum = 0;
		for(CardVO cardVO : deckList) {
			sum += cardVO.getValue();
		}
		return sum;
	}
	
	public Player getWinner(List<Player> players) {
		Player highestPlayer = null;
		int highestValue = 0;
		
		for(Player player : players) {
			int playerValueSum = getValueSum(player.openCards());
			if(playerValueSum>highestValue) {
				highestPlayer = player;
				highestValue = playerValueSum;
			}
		}
		return highestPlayer;
	}
	

}
