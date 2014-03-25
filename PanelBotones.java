import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class PanelBotones extends JPanel implements ActionListener {

	private JButton abrir,
	guardar;

	private JTextField vx,
					   vy,
					   altura,
					   aceleracion;

	private JSlider barra;
	private Checkbox dibujar;

	public PanelBotones(){
		//((FlowLayout)this.getLayout()).setAlignment(FlowLayout.LEFT);
		//JScrollPane scroller = new JScrollPane(panelBoton); 

		this.vx=new JTextField();
		this.vx.setBounds(125, 90, 70, 35);
		JLabel etiquetavx=new JLabel("Vx:");
		etiquetavx.setBounds(60, 85, 350, 50);

		this.vy=new JTextField();
		this.vy.setBounds(125, 160, 70, 35);
		JLabel etiquetavy=new JLabel("Vy:");
		etiquetavy.setBounds(60, 155, 350, 50);

		this.altura=new JTextField();
		this.altura.setBounds(125, 230, 70, 35);
		JLabel etiquetamax=new JLabel("Altura Maxima:");
		etiquetamax.setBounds(30, 220, 350, 50);

		this.aceleracion=new JTextField();
		this.aceleracion.setBounds(125, 300, 70, 35);
		JLabel etiquetaaceleracion=new JLabel("Aceleracion:");
		etiquetaaceleracion.setBounds(30, 290, 350, 50);

		this.barra = new JSlider (JSlider.VERTICAL,0,100,0);
		this.barra.setPaintLabels(true);
		this.barra.setPaintTicks(true);
		this.barra.setMajorTickSpacing(25);
		this.barra.setMinorTickSpacing(5);
		this.barra.setPaintLabels(true);
		this.barra.setBounds(105, 390, 70, 145);

		this.dibujar=new Checkbox();
		this.dibujar.setBounds(140, 559, 70, 35);
		JLabel etiquetadibujar=new JLabel("Dibujar Linea");
		etiquetadibujar.setBounds(30, 550, 350, 50);

		this.guardar=new JButton("Guardar");
		this.guardar.addActionListener(this);
		this.guardar.setBounds(210, 650, 100, 50);

		this.abrir=new JButton("Abrir");
		this.abrir.addActionListener(this);
		this.abrir.setBounds(45, 650, 100, 50);

		this.add(this.guardar);
		this.add(this.abrir);
		this.add(this.vx);
		this.add(etiquetavx);
		this.add(this.vy);
		this.add(etiquetavy);
		this.add(this.altura);
		this.add(etiquetamax);
		this.add(this.aceleracion);
		this.add(etiquetaaceleracion);
		this.add(this.barra);
		this.add(this.dibujar);
		this.add(etiquetadibujar);
		
		this.setPreferredSize(new Dimension (1024,768));

	}

	public static void main(String[] args) {


	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
