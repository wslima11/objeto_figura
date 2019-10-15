package oop.model;

import oop.domain.BiDimensional;

public class Triangulo extends Figura implements BiDimensional {
	
	public Triangulo() {
		super(5,9, "T");
	}
	
	@Override
	public void setAlt(int altura) {
		setAltura(altura);
	}

	@Override
	public void setLarg(int largura) {
		setLargura(largura);
	}
	
	@Override
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(toString() + "\n");
		
		int meio = getLargura() / 2;
		meio += getLargura() % 2 == 0 ? 1 : 0;
		
		for (int linha = 0; linha < getAltura(); linha++) {
			for (int coluna = 0; coluna < getLargura(); coluna++) {
				if(coluna >= (meio - linha) && coluna <= (meio + linha)) {
					desenho.append(getSimbolo());
				} else {
					desenho.append(getFundo());
				}
			}
			desenho.append("\n");
		}
		
		return desenho.toString();
	}
}
