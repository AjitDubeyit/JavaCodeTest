package com.codifyd.command;

public class OnCommand implements Command {

	Television television;
	
	public OnCommand(Television television) {
		this.television = television;
	}

	
	@Override
	public void execute(Television television) {
		this.television.on();
	}

}
