package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelAnimacion extends JPanel implements Runnable,MouseListener {
	
	private int x=75,
			    y=0;
	private double formula;
	
	private JLabel Jalturamax;
	private int altura=1;
	private Ventana v;
	
	public PanelAnimacion(Ventana v){
		this.setLayout(null);
		this.v=v;
		
		
		//this.altura=Ventana.miventana.PanelBotones.getAlturaMax();
		this.Jalturamax=new JLabel("mts: "+100);
		this.Jalturamax.setBounds(80,50,90,40);
		
		//this.add(this.Jalturamax);
		
		this.setPreferredSize(new Dimension(800,720));
		
		
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y= y;
		this.repaint();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		/*this.x=75;
		this.y=150;*/
				
		g.drawLine(0, 0, 0, 720);
		g.drawLine(100, 90, 100, 590);
		g.drawLine(100, 590, 720, 590);
		g.setColor(Color.BLUE);
		//this.formula=this.y*
		int escala = (500*this.y)/this.altura;
		System.out.println(escala);
		
		g.fillOval(this.x, 590-(escala+25), 50, 50);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void setAlturaMaxima(int alturaMax) {
		// TODO Auto-generated method stub
		this.altura = alturaMax;
		System.out.println(this.altura);
	}

}
