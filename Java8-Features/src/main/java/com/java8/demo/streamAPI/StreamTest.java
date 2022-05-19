package com.java8.demo.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		/*
		List<String> myList = Arrays.asList("a2","a1","b1","c2","c1");
		myList.stream()
		.filter(x -> x.startsWith("a"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		*/
		
		/*Arrays.asList("a1","a2","a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::print);
		*/
		
		/*Stream.of("a1","a2","a3")
		.findFirst()
		.ifPresent(System.out::print);
		*/
		
		//IntStream.range(1, 4).forEach(System.out::print);
		
		/*Arrays.stream(new int[] {1,2,3})
		.map(x->x*2+1)
		.average()
		.ifPresent(System.out::print);
		*/
		
		/*Stream.of("a1","a2","a3")
		.map(x->x.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		*/
		
		/*IntStream.range(1, 4)
		.mapToObj(i -> i+"a")
		.forEach(System.out::println);
		*/
		
		/*Stream.of(1.0,2.0,3.0)
		.mapToInt(Double::intValue)
		.mapToObj(i -> "a"+i)
		.forEach(System.out::println);
		*/
		
		/*List<String> myList = Arrays.asList("a2","a1","b1","c2","c1");
		List<String> myList1 = myList.stream()
				.filter(x->{
					System.out.println("Filter: " + x);
					return x.startsWith("a");	
				})
				.collect(Collectors.toList());
		
		myList1.forEach(y -> {
			System.out.println(y);
		});
		*/
		
		/*Stream.of("d2","a2","b1","b3","c","d5")
		.filter(x->{
			System.out.println("Filter: " + x);
			return x.startsWith("d");
		})
		.map(s -> {
			System.out.println("Map: " + s);
			return s.toUpperCase();
		})
		.forEach(x->System.out.println(x));
		*/
		
		
		/*Stream.of("d8","d2","a2","b1","b3","c","d5")
		.sorted((a1,a2) ->{
			return a1.compareTo(a2);
		})
		.filter(x->x.startsWith("d"))
		.map(x->x.toUpperCase())
		.forEach(x->System.out.println(x));
		*/
		
		
//		Stream.of("d8","d2","a2","b1","b3","c","d5")
//		.filter(x->{ 
//			System.out.println("Filter: " + x);
//			return x.startsWith("d");
//		})
//		.sorted((a1,a2) -> a1.compareTo(a2))
//		.map(x->x.toUpperCase())
//		.forEach(x-> System.out.println("forEach: " + x));
//		
		
		
		/*
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Ajit", 29));
		personList.add(new Person("Jyoti", 29));
		personList.add(new Person("Shubham", 28));
		personList.add(new Person("Alok", 28));
		
		List<Person> pList = personList.stream()
				.filter(x-> x.name.startsWith("A"))
				.collect(Collectors.toList());
		
		pList.forEach(x->{
			System.out.println("Name: "+x.name+" Age: "+x.age);
		});
		*/
		
		
		/*
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Ajit", 29));
		personList.add(new Person("Jyoti", 29));
		personList.add(new Person("Shubham", 28));
		personList.add(new Person("Alok", 28));
		
		Map<Integer, List<Person>> groupAgePeople = personList.stream()
				.collect(Collectors.groupingBy(x->x.age));
		
		groupAgePeople.forEach((x,y) -> System.out.println("Age: " + x + " Person: " + y));
		*/
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Ajit", 29));
		personList.add(new Person("Jyoti", 29));
		personList.add(new Person("Shubham", 28));
		personList.add(new Person("Alok", 28));
		
		Map<Integer, List<Person>> groupAgePeople = personList.stream()
				.collect(Collectors.groupingBy(x->x.age));
		
		groupAgePeople.forEach((x,y) -> System.out.println("Age: " + x + " Person: " + y));
		
		
		
		
	}
}
