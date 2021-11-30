package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		
		x = new Triangulo ();
		y = new Triangulo ();
		
		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("%.2f\n", areax);
		System.out.printf("%.2f\n", areay);
		
		if(areax > areay) {
			System.out.printf("X");
		}
		else {
			System.out.printf("Y");
		}
		
		sc.close();

	}

}
