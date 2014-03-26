import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;



public class Ventana extends JFrame implements ActionListener{

	public Ventana(){
		super("Tiro Parabolico ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new PanelBotones(),BorderLayout.WEST);
		this.pack();
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Ventana miventana= new Ventana();
	}


	@Override
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



