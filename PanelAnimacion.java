import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelAnimacion extends JPanel implements Runnable,MouseListener {
	
	private JLabel Jalturamax;
	private int altura;
	
	public PanelAnimacion(){
		this.setLayout(null);
		//this.altura=PanelBotones.getAlturaMax();
		this.Jalturamax=new JLabel("mts: "+100);
		this.Jalturamax.setBounds(80,50,90,40);
		
		this.add(this.Jalturamax);
		
		this.setPreferredSize(new Dimension(800,720));
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(0, 0, 0, 720);
		g.drawLine(100, 90, 100, 590);
		g.drawLine(100, 590, 720, 590);
		g.setColor(Color.BLUE);
		g.fillOval(75, 560, 50, 50);
		
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

}
