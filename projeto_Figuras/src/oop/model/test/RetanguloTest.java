package oop.model.test;

import oop.model.Retangulo;

public class RetanguloTest {
	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		
		ret.setAltura(10);
		ret.setLargura(18);
		ret.setSimbolo("# ");
		ret.setFundo("  ");
		
		System.out.println(ret.desenhar());
	}
}
