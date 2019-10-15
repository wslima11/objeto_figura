package oop.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DesenhoView extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextArea area;
	
	public DesenhoView() {
		initComponents();
		initView();
		init();
	}
	
	public void preencherArea(String desenho) {
		area.setText(desenho);
		this.setVisible(true);
	}
	
	public void limparArea() {
		area.setText("");
	}

	private void init() {
		this.setTitle("Desenho Figura");
		this.setSize(600, 400);
		this.setResizable(false);
	}

	private void initView() {
		area.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		area.setEditable(false);
		JScrollPane painel = new JScrollPane(area);
		this.add(painel);
		
	}

	private void initComponents() {
		area = new JTextArea();
		
	}

}
