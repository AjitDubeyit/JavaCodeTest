package com.codifyd.command;

public class RemoteControl {

	private Command command;

	public void pressButton() {
		command.execute(null);
	}
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
}
