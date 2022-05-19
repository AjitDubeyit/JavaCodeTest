package com.codifyd.adapter;

public class School {

	public static void main(String[] args) {
		
		Pen pp = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pp);
		aw.writeAssignment("writing assignment!");
		// TODO Auto-generated method stub

	}

}
