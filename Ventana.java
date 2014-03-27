package src;

import java.awt.BorderLayout;

import javax.swing.JFrame;



public class Ventana extends JFrame{

	private PanelBotones pB;
	private PanelAnimacion pA;
	
	public PanelAnimacion getPanelAnimacion(){
		return this.pA;
	}
	
	public Ventana(){
		super("Tiro Parabolico ");
		
		pB = new PanelBotones(this);
		pA = new PanelAnimacion(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(this.pB,BorderLayout.WEST);
		this.add(this.pA,BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		Ventana miventana= new Ventana();
		
	}

}



