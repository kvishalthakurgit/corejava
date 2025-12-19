package ipa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		extracted();
		//testSum();
		//new A();
		//internal();
	}
	
	//interview
	public static void test(){
		String input = "AAAABBBCCDDDDD";
		String arr[]= input.split("");
		String init = arr[0];
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i].equals(init)){
				init=arr[i];
				count++;
				
			}else{
			System.out.print(init+""+count);  //A4B3
			count=0;
			init=arr[i];  //B
			count++;     //1
			}
			if(i==arr.length-1) {
				//System.out.print(init+""+count); 
			}
		}
	}
	
	public static void internal() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		for (String l : list) {
		 if (l.equals("2")) {
			 list.remove("2");
		 }
		System.out.println(list);
		}
	}

	public static void testSum() {
		for (int i = 1; i < 11; i++) {
			int num = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					num = num + j;
				}
			}
			if (i == num) {
				System.out.println(i);
				System.out.println(num);
			}
		}
	}

	private static void extracted() {
		List<Employee> l2 = new ArrayList<>();
		Employee e1 = new Employee(1, "jvishal");
		Employee e2 = new Employee(2, "vishal1");
		Employee e3 = new Employee(1, "jvishal2");
		Employee e4 = new Employee(3, "vishal3");

		l2.add(e1);
		l2.add(e2);
		l2.add(e3);
		l2.add(e4);

		List<Employee> collect = l2.stream().distinct().collect(Collectors.toList());
		collect.forEach((e) -> System.out.println(e.SSN));

		IntSummaryStatistics collect2 = Arrays.asList(100, 200).stream().map(x -> x > 100 ? x = x - x * 10 / 100 : x)
				.collect(Collectors.summarizingInt(x -> x));
		
		int sum = Arrays.asList(100, 200).stream().map(x -> x > 100 ? x = x - x * 10 / 100 : x)
				.mapToInt(x -> x.intValue()).sum();
		System.out.println(sum);

		int sum2 = Arrays.asList("vishal,Thakur").stream().mapToInt(x -> x.length()).sum();
		System.out.println("sum2="+sum2);

		int sum3 = Arrays.asList(10, 20, 30, 50, 60, 70, 80, 90).stream().filter(x -> x < 50).mapToInt(x -> x).sum();
		System.out.println("sum3=" + sum3);

		IntSummaryStatistics collect3 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90).stream().filter(x -> x < 50)
				.collect(Collectors.summarizingInt(x -> x));
		System.out.println(collect3.getAverage());

		OptionalDouble average = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90).stream().filter(x -> x < 50)
				.mapToInt(x -> x).average();

		System.out.println(average);

		List<String> stringList = List.of("apple", "banana", "orange", "kiwi");

		// Convert List<String> to Map<String, Integer>
		Map<String, Number> collect4 = stringList.stream().collect(Collectors.toMap(key -> key, val -> val.length()));

		System.out.println("collect4-" + collect4);

		// Print the resulting map
	}
}

class A{
	public A() {
		new B();
	}
}
class B{
	public B() {
		new A();
	}
}