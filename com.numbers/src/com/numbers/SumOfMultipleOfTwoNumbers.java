package com.numbers;

public class SumOfMultipleOfTwoNumbers {
	/* Sum of the multiples of two numbers below N */
	static int findSum(int n, int a, int b) {
		int sum = 0;
		for (int i = 0; i < n; i++)

			if (i % a == 0 || i % b == 0)
				sum += i;

		return sum;
	}

	public static void main(String[] args) {
		int n = 10, a = 3, b = 5;
		System.out.println(findSum(n, a, b));
	}
}