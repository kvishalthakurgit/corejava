package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8GroupingBy {
	public static void main(String[] args) {
		List<String> g = Arrays.asList("geeks", "for", "geeks");

		Map<String, Long> collect = g.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		String collect2 = g.stream().collect(Collectors.joining("-"));
		g.stream().reduce((x, y) -> x + "-" + y);

		collect.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

		collect.keySet().stream().forEach(k -> {
			System.out.println("hello " + k);
			System.out.println(collect.get(k));
		});

		System.out.println(collect2);

		// ===============
		List<Integer> j = Arrays.asList(10, 20, 30);
		List<String> i = Arrays.asList("10", "20", "30");
		Integer collect3 = j.stream().collect(Collectors.summingInt(x -> x));
		Integer collect4 = i.stream().mapToInt(x -> Integer.parseInt(x)).sum();
		// Integer collect4 = i.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(collect3);
		System.out.println(collect4);
	}

	public void groupbyTest() {
		List<Transaction> trans = Arrays.asList(new Transaction(100.0, "Credit", true),
				new Transaction(150.0, "Debit", true), new Transaction(200.0, "Credit", false),
				new Transaction(50.0, "Debit", true), new Transaction(300.0, "Credit", true));

		// List<Transaction> collect =
		// trans.stream().filter(t->t.isSuccess()).collect(Collectors.toList());
		// System.out.println(collect);

		trans.stream()
				.collect(Collectors.groupingBy(x -> x.getType(), Collectors.summarizingDouble(Transaction::getAmount)));
	}
}

class Transaction {

	private double amount;
	private String type;
	private boolean isSuccess;

	public Transaction(double amount, String type, boolean isSuccess) {
		super();
		this.amount = amount;
		this.type = type;
		this.isSuccess = isSuccess;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", type=" + type + ", isSuccess=" + isSuccess + "]";
	}
}
