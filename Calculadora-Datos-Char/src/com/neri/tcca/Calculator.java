package com.neri.tcca;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.println("Ingresa un numero:");
		int num1 = in.nextInt();
		System.out.println("Ingresa otro numero:");
		int num2 = in.nextInt();
		System.out.println("Indica el operador:");
		char input = in.next().charAt(0);
		
		if( input == '*')
		answer = num1 * num2;
		else if( input == '/')
		answer = num1 / num2;
		else if( input == '%')
		answer = num1%num2;
		else if( input == '+')
		answer = num1 + num2;
		else if( input == '-')
		answer = num1 -num2;
		else
		System.out.println("Invalid Command");
		System.out.println("The result is: "+ answer);

	}

}
