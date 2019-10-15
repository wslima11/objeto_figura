package oop.view;

import javax.swing.JComboBox;

import oop.model.Figura;
import oop.model.Quadrado;
import oop.model.Retangulo;
import oop.model.Triangulo;

public class FiguraComboBox extends JComboBox<Figura> {
	private static final long serialVersionUID = 1L;
	
	public FiguraComboBox() {
		super(new Figura[] {
					new Quadrado(), 
					new Retangulo(), 
					new Triangulo()
		});
	}
}
