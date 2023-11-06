package com.gradedproject.q2;

class PowerCalculator {
	public long calculatePower(int x, int n) {
        if (n < 0) {
            System.out.println("Please enter a non-negative value for N.");
            return -1;
        }
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            long halfPow = calculatePower(x, n / 2);
            return halfPow * halfPow;
        } else {
            long halfPow = calculatePower(x, (n - 1) / 2);
            return x * halfPow * halfPow;
        }
}
}