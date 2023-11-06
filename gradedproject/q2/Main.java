package com.gradedproject.q2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
    PowerCalculator powerCalculator = new PowerCalculator();

    System.out.print("Enter the base number X: ");
    int x = scanner.nextInt();

    System.out.print("Enter the power N: ");
    int n = scanner.nextInt();
    scanner.close();
    
    if (n < 0) {
        System.out.println("Please enter a non-negative value for N.");
    } else {
        long result = powerCalculator.calculatePower(x, n);

        if (result != -1) {
            System.out.println("X power N is: " + result);
        }
    }
}
}
