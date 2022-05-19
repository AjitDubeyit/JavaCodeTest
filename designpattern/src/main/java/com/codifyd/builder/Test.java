package com.codifyd.builder;

public class Test {

	public static void main(String[] args) {
		//HttpClient uglyClient = new HttpClient("GET", "http://test.com", null, null, null, null);
		
		HttpClient client = new HttpClient.HttpClientBuilder()
				.method("POST").url("http://test.com").body("{}")
				.secure("user", "pass")
				.build();
		
		System.out.println(client);
		
		
		
	}

}
