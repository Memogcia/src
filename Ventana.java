import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ventana extends JFrame implements ActionListener{

	public Ventana(){
		super("Tiro Parabolico ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new PanelBotones(),BorderLayout.WEST);
		this.add(new PanelAnimacion(),BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		Ventana miventana= new Ventana();
		
	}


	public void actionPerformed(ActionEvent x) {
		/*
		if(x.getSource()==this.abrir){
			MiPanel panelpopup=new MiPanel();
			//panelpopup.setLayout(null);

			Ventana vabrir=new Ventana();
			vabrir.pack();
			vabrir.setVisible(true);
		 */
	}
}



