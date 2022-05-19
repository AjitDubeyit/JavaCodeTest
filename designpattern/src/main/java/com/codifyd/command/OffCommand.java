package com.codifyd.command;

public class OffCommand implements Command {

	Television television;
	
	public OffCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute(Television television) {
		this.television.off();
	}

}
