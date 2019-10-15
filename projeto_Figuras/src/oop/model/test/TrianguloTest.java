package oop.model.test;

import oop.model.Triangulo;

public class TrianguloTest {
	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.setAltura(5);
		t.setLargura(9);
		t.setSimbolo("* ");
		t.setFundo("  ");
		System.out.println(t.desenhar());
	}
}
