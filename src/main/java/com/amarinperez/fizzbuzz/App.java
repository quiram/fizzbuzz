package com.amarinperez.fizzbuzz;

import java.io.PrintStream;

public class App {
	private static final PrintStream console = System.out;

	public static void main(String[] args) {
		if (args.length != 2) {
			printUsage();
		}

		try {
			runProgram(args);
		}
		catch (Exception e) {
			printError(e);
		}
	}

	private static void runProgram(String[] args) {
		int first = Integer.parseInt(args[0]);
		int last = Integer.parseInt(args[1]);
		FizzBuzzRunner runner = new FizzBuzzRunner();
		String result = runner.run(first, last).toString();

		print(result);
	}

	private static void printError(Exception e) {
		print("Failed to run program due to: " + e.getMessage());
		printUsage();

		print();
		print("Error details follow:");
		e.printStackTrace(console);
	}

	private static void printUsage() {
		print("Usage: java -jar <jarfile> <first> <last>");
		print("    first: first number in the range");
		print("    last:  last number in the range");
	}

	private static void print() {
		print("");
	}

	private static void print(String line) {
		console.println(line);
	}
}
