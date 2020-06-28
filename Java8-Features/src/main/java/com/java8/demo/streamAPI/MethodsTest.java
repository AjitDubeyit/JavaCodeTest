/*
 * package com.java8.demo.streamAPI;
 * 
 * import java.util.Arrays; import java.util.List; import java.util.Random;
 * import java.util.stream.Collectors;
 * 
 * public class MethodsTest {
 * 
 * public static void main(String[] args) { //forEach //Stream has provided a
 * new method ‘forEach’ to iterate each element of the stream. The following
 * code segment shows how to print 10 random numbers using forEach. Map The
 * ‘map’ method is used to map each element to its corresponding result. The
 * following code segment prints unique squares of numbers using map.
 * 
 * List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5); List<Integer>
 * squaresList = numbers.stream().map(i->
 * i*i).distinct().collect(Collectors.toList());
 * System.out.println(squaresList);
 * 
 * Filter The ‘filter’ method is used to eliminate elements based on a criteria.
 * The following code segment prints a count of empty strings using filter.
 * 
 * List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","",
 * "jkl");
 * 
 * //get count of empty string long count = strings.stream().filter(string ->
 * string.isEmpty()).count(); System.out.println(count);
 * 
 * Limit The ‘limit’ method is used to reduce the size of the stream. The
 * following code segment shows how to print 10 random numbers using limit.
 * 
 * //Random random = new Random();
 * //random.ints().limit(10).forEach(System.out::println);
 * 
 * Sorted The ‘sorted’ method is used to sort the stream. The following code
 * segment shows how to print 10 random numbers in a sorted order.
 * 
 * //Random random1 = new Random();
 * //random1.ints().limit(10).sorted().forEach(System.out::println); } }
 */