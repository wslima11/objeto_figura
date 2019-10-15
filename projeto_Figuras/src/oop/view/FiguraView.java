package oop.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import oop.domain.BiDimensional;
import oop.domain.UniDimensional;
import oop.model.Figura;

public class FiguraView extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JLabel figuraLabel;
	private JComboBox<Figura> figuraComboBox;
	private JLabel simboloLabel;
	private JTextField simboloTextField;
	private JLabel alturaLabel;
	private JSpinner alturaSpinner;
	private JLabel larguraLabel;
	private JSpinner larguraSpinner;
	private JButton desenharButton;
	private JButton limparButton;
	private DesenhoView desenhoView;
	
	public FiguraView() {
		super();
		initComponents();
		initView();
		init();
	}
	
	private void escolherFigura(ActionEvent e) {
		Figura f = (Figura) figuraComboBox.getSelectedItem();
		
		simboloTextField.setText(f.getSimbolo());
		alturaSpinner.setValue(f.getAltura());
		larguraSpinner.setValue(f.getLargura());
		
		boolean isUni = f instanceof UniDimensional;
		larguraLabel.setVisible(!isUni);
		larguraSpinner.setVisible(!isUni);
		alturaLabel.setText(isUni ? "Lado: " : "Altura: ");
		
		
	//		if(f instanceof UniDimensional) {
	//			larguraLabel.setVisible(false);
	//			larguraSpinner.setVisible(false);
	//			alturaLabel.setText("Lado: ");
	//		} else {
	//			larguraLabel.setVisible(true);
	//			larguraSpinner.setVisible(true);
	//			alturaLabel.setText("Altura: ");
	//		}
	}

	private void desenharFigura(ActionEvent e) {
		Figura f = (Figura) figuraComboBox.getSelectedItem();
		
		f.setSimbolo(simboloTextField.getText().trim() + " ");

		if(f instanceof UniDimensional) {
			UniDimensional d = (UniDimensional) f;
			d.setLado((int) alturaSpinner.getValue()); 
		} else if(f instanceof BiDimensional){
			BiDimensional d = (BiDimensional) f;
			d.setAlt((int) alturaSpinner.getValue());
			d.setLarg((int) larguraSpinner.getValue());
		}
		
		String desenho = f.desenhar();
		desenhoView.preencherArea(desenho);
		limparButton.setEnabled(true);
	}
	
	private void limparFigura(ActionEvent e) {
		desenhoView.limparArea();
		limparButton.setEnabled(false);
		desenhoView.setVisible(false);
	}
	
	//DEFINIR O ESTADO INICIAL DA TELA
	private void init() {
		escolherFigura(null);
		limparButton.setEnabled(false);
		
		figuraComboBox.addActionListener(e -> escolherFigura(e));
		desenharButton.addActionListener(e -> desenharFigura(e));
		limparButton.addActionListener(e -> limparFigura(e));
		
		
		this.setTitle("Impacta Figura");
		this.setSize(280, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}

	//ORGANIZA O LAYOUT QUE DEVE SER EXIBIDO
	private void initView() {
		
		JPanel painel = new JPanel(new GridLayout(0, 2));
		painel.add(figuraLabel);
		painel.add(figuraComboBox);
		painel.add(simboloLabel);
		painel.add(simboloTextField);
		painel.add(alturaLabel);
		painel.add(alturaSpinner);
		painel.add(larguraLabel);
		painel.add(larguraSpinner);
		painel.add(desenharButton);
		painel.add(limparButton);
		
		this.add(painel);
	}
	
	//INICIALIZA OS ATRIBUTOS(COMPONENTS) 
	private void initComponents() {
		figuraLabel = new JLabel("Figura: ");
		figuraComboBox = new FiguraComboBox();
		simboloLabel = new JLabel("Simbolo: ");
		simboloTextField = new JTextField("*");
		alturaLabel = new JLabel("Altura: ");
		alturaSpinner = new JSpinner(new SpinnerNumberModel(5, 0, 50, 1));
		larguraLabel = new JLabel("Largura: ");
		larguraSpinner = new JSpinner(new SpinnerNumberModel(9, 0, 50, 1));
		desenharButton = new JButton("Desenhar");
		limparButton = new JButton("Limpar");
		desenhoView = new DesenhoView();
	}
}