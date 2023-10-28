package com.tnsif.stream;
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOperations {

	public static void main(String[] args) {
		
		Integer[] values=new Integer[] {3,4,7,8};//get the input
       Stream<Integer> stream=Arrays.stream(values);    
       //map function
       System.out.println("Square of no " +Arrays.toString(values));
       stream.map(num->num*num).forEach(System.out::println);
        //limit returns first 2 elements
       System.out.println("First 2 elemets");
       Arrays.stream(values).limit(2).forEach(System.out::println);
	   //limit skip list 2 elements
	   System.out.println("skip first 2 elements");
	   Arrays.stream(values).skip(2).forEach(System.out::println);
	   //distinct elements
	List<Integer>list=Arrays.asList(1,1,3,4,5,3,2);
	System.out.println("distinct elements");
	list.stream().distinct().forEach(System.out::println);
    //distinct count
	long c =list.stream().distinct().count();
	System.out.println("count distinct elements");
	System.out.println(c);
	//uppercase conversion
	List<String>letters=Arrays.asList("Anusha","Dev","Sreeja");
	Stream<String>stream1=letters.stream();
	System.out.println("to uppercase");
	List<String>s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
	System.out.println(s1);
	//filter operation
	List<Integer>s2=Arrays.asList(2,3,4,5,6,7,8,9);
	System.out.println("filter odd numbers");
	s2.stream().filter(num->num%2==1).forEach(System.out::println);
	 
	}
}
