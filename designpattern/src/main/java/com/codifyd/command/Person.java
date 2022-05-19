package com.codifyd.command;

public class Person {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl();
		
		OnCommand oncommand = new OnCommand(television);
		remoteControl.setCommand(oncommand);
		remoteControl.pressButton();

		OffCommand offCommand = new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();
		
	}

}
