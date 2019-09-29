package com.biz.blackjack.domain;

public class CardVO {

	private String patten;
	private String denomination;
	private int value;
	
	
	
	
	public CardVO() {
		super();
	}
	
	
	public CardVO(String patten, int index) {
		this.patten = patten;
		this.denomination =this.numberToDeno(index);
		this.value = this.numberToPoint(index);
	}
	
	private String numberToDeno(int number) {
		if(number == 1) {
			return "A";
		}else if(number == 11) {
			return "j";
		}else if(number == 12) {
			return "Q";
		}else if(number ==13) {
			return "K";
		}
		return String.valueOf(number);
	}
	
	
	private int numberToPoint(int number) {
		if(number >=11) {
			return 10;
		}
		return number;
	}
	
	

	public String getPatten() {
		return patten;
	}
	public void setPatten(String patten) {
		this.patten = patten;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "CardVO [patten=" + patten + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
}
