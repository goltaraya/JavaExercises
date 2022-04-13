package application;

import entities.Reverse;

public class Program {
	public static void main(String[] args) {
		Reverse rev = new Reverse("Juliana is beautiful.");
		System.out.println("Normal: " + rev);
		System.out.println("Reverse: " + rev.reverse());
	}
}
