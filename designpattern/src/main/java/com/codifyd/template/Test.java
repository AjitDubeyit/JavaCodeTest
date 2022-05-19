package com.codifyd.template;

public class Test {

	public static void main(String[] args) {

		DataRenderer rendrer = new XMLDataRenderer();
		rendrer.render();
		
		DataRenderer csvRendrer = new CSVDataRenderer();
		csvRendrer.render();
		
	}

}
