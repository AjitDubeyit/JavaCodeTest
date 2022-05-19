package com.codifyd.prototype;

public class Game implements Cloneable {
	
	private int id;
	private String name;
	private Membership membership;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	
	
	@Override
	protected Game clone() throws CloneNotSupportedException {
		Game game = (Game) super.clone();
		game.setMembership(new Membership());//Deep copy
		return game;
		//return (Game) super.clone(); //Shello copy
	}
	
	Game(Game game){
		this.id = game.id;
		this.name = game.name;
		this.membership = new Membership();
	}
	
	Game(){}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", membership=" + getMembership() + "]";
	}
	
	

}
