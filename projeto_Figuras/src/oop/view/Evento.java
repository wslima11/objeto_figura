package oop.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Evento implements MouseListener, KeyListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicou!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Passou em cima!");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Saiu");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Pressionou teclado");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
