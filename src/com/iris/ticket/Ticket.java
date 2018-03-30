package com.iris.ticket;

public class Ticket {
	String date;
	String time;
	String fromPlace;
	String toPlace;
	String money;
	
	public Ticket(String date, String time, String from, String to,String money){
		this.date = date;
		this.time = time;
		this.fromPlace = from;
		this.toPlace = to;
		this.money =money;
	}
	public void print(){
		String total = date +" "+ time +" "+ fromPlace +" "+ toPlace+" $"+money;
		System.out.println(total);
	}
	
}
