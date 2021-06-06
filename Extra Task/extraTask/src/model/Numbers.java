package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Numbers {
	int n1, n2, n3, n4, n5;

	ArrayList<Integer> numbers;

	public Numbers(String n1, String n2, String n3, String n4, String n5) {
		numbers = new ArrayList<>();

		numbers.add(Integer.parseInt(n1));
		numbers.add(Integer.parseInt(n2));
		numbers.add(Integer.parseInt(n3));
		numbers.add(Integer.parseInt(n4));
		numbers.add(Integer.parseInt(n5));

		System.out.println("numbers:" + numbers.toString());
	}

	public int addAll() {

		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		System.out.println("Addition:" + result);
		return result;
	}

	public int mulAll() {

		int result = 1;
		for (int number : numbers) {
			result *= number;
		}
		System.out.println("multiplication:" + result);
		return result;
	}

	public int subAll() {
		int result = 0;
		result = numbers.get(0) - numbers.get(1);
		for (int i = 2; i < numbers.size(); i++) {
			result -= numbers.get(i);
		}
		System.out.println("Substraction:" + result);
		return result;
	}

	public float divAll() {
		float result = 0;
		result = numbers.get(0) / numbers.get(1);
		for (int i = 2; i < numbers.size(); i++) {
			result /= (float) numbers.get(i);
		}
		System.out.println("Division:" + result);
		return result;
	}

	public int findMax() {

		int max = 0;

		for (int int1 : numbers) {
			if (int1 > max) {
				max = int1;
			}
		}
		System.out.println("Maximum:" + max);
		return max;
	}

	public int findMin() {

		int min = numbers.get(0);

		for (int int1 : numbers) {
			if (int1 < min) {
				min = int1;
			}
		}
		System.out.println("minimum:" + min);
		return min;
	}

	public float findAvg() {
		int sum = 0;

		for (int int1 : numbers) {
			sum += int1;
		}
		System.out.println(("Average:" + (float) sum / (float) numbers.size()));
		return (float) sum / (float) numbers.size();
	}

	public String findFactorial() {

		int fact = 0;
		HashMap<Integer, Integer> factorials = new HashMap<>();

		for (int int1 : numbers) {
			fact = fact(int1);

			factorials.put(int1, fact);
		}
		System.out.println("factorial : " + factorials.toString());
		return factorials.toString();
	}

	private int fact(int no) {
		int ans = 1;
		for (int i = no; i > 0; i--) {
			ans *= i;
		}
		System.out.println("factorial of " + no + " is " + ans);
		return ans;
	}

	public String getString() {
		return numbers.toString();
	}
}
