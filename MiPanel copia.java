import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MiPanel extends JPanel implements Runnable, MouseListener {
	private Image fondo;
	private int xPos, yPos;
	private boolean movimiento;
	
	
	public void setFondo(Color fondo){
		this.setBackground(fondo);
		repaint();
	}

	public MiPanel(){
		this.setPreferredSize(new Dimension(800,600));
		this.fondo=new ImageIcon("Lighthouse.jpg").getImage();
		this.xPos=this.yPos=0;
		Thread myHilo=new Thread(this);
		this.movimiento=false;
		this.addMouseListener(this);
		myHilo.start();
	}

	public void paint(Graphics g){

		super.paintComponent(g);//usarlo en swing el paintComponent
		//g.drawImage(this.fondo,0,0,this.getWidth(),this.getHeight(),null);

		g.setColor(Color.RED);
		g.fillOval(this.xPos+100,this.yPos+300,100,100);

		g.setColor(Color.BLACK);
		g.drawLine(this.xPos+150, this.yPos+400, this.xPos+150, this.yPos+450);

		g.setColor(Color.ORANGE);
		g.fillOval(this.xPos+100,this.yPos+440,200,100);

	}
	public void run(){
		try {
			while(true){
				Thread.sleep(40);
				if(movimiento){
					this.xPos+=5;
					this.yPos--;
					this.repaint();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.movimiento=true;

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

